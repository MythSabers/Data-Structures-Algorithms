import tree.Node;

class PrintNodeAtKDistanceSolution{
    void print(Node root, int k) {
        if (root == null)
            return;
        if (k == 0)
            System.out.println(root.data);
        else {
            print(root.left, k - 1);
            print(root.right, k - 1);
        }
    }
}

public class PrintNodeAtKDistance {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        int k = 2;

        new PrintNodeAtKDistanceSolution().print(root, k);
    }
}
