import java.util.HashMap;

class Node_Cache {
    int key;
    int value;
    Node_Cache pre;
    Node_Cache next;
    Node_Cache(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache_Implementation {
    private HashMap<Integer, Node_Cache> map;
    private int capacity, count;
    private Node_Cache head, tail;

    public LRUCache_Implementation(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node_Cache(0, 0);
        tail = new Node_Cache(0, 0);
        head.next = tail;
        tail.pre = head;
        head.pre = null;
        tail.next = null;
        count = 0;
    }

    public void deleteNOde(Node_Cache node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public void addToHead(Node_Cache node) {
        node.next = head.next;
        node.next.pre = node;
        node.pre = head;
        head.next = node;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node_Cache node = map.get(key);
            int result = node.value;
            deleteNOde(node);
            addToHead(node);
            System.out.println("Got the value : " +  result + " for the key: " + key);
            return result;
        }
        System.out.println("Did not get any value for the key: " + key);
        return -1;
    }

    public void set(int key, int value) {
        System.out.println("Going to set the (Key, Value) : (" + key + "," + value + ")");
        if (map.containsKey(key)) {
            Node_Cache node = map.get(key);
            node.value = value;
            deleteNOde(node);
            addToHead(node);
        } else {
            Node_Cache node = new Node_Cache(key, value);
            map.put(key, node);
            if (count < capacity) {
                count++;
                addToHead(node);
            } else {
                map.remove((tail.pre.key));
                deleteNOde(tail.pre);
                addToHead(node);
            }
        }
    }
}

public class LRUCache {
    public static void main(String[] args) {
        LRUCache_Implementation cache = new LRUCache_Implementation(2);

        // it will store a key (1) with value
        // 10 in the cache.
        cache.set(1, 10);

        // it will store a key (2) with value 20 in the cache.
        cache.set(2, 20);
        System.out.println("Value for the key: 1 is " + cache.get(1)); // returns 10

        // removing key 2 and store a key (3) with value 30 in the cache.
        cache.set(3, 30);

        System.out.println("Value for the key: 2 is " +
                cache.get(2)); // returns -1 (not found)

        // removing key 1 and store a key (4) with value 40 in the cache.
        cache.set(4, 40);
        System.out.println("Value for the key: 1 is " +
                cache.get(1)); // returns -1 (not found)
        System.out.println("Value for the key: 3 is " +
                cache.get(3)); // returns 30
        System.out.println("Value for the key: 4 is " +
                cache.get(4)); // return 40
    }
}
