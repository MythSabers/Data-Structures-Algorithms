import tree.Node;

import java.util.LinkedList;
import java.util.Queue;

class LevelOrderTraversalSolution {
    void printLevel(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        StringBuilder builder = new StringBuilder();
        while (!q.isEmpty()) {
            Node curr = q.poll();
            builder.append(curr.data).append(" ");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
        System.out.println(builder);
    }

    void printLineByLine(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while (q.size() > 1) {
            Node curr = q.poll();
            if (curr == null) {
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.data + " ");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }
}


public class LevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(15);
        root.left.left = new Node(30);
        root.right = new Node(20);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.left.left = new Node(60);
        root.right.left.right = new Node(70);

        new LevelOrderTraversalSolution().printLineByLine(root);
    }
}
