import tree.Node;

import java.text.DecimalFormat;

class MaximumInBinaryTreeSolution {
    int max(Node root) {
        if (root == null)
            return 0;
        return Math.max(root.data, Math.max(max(root.left), max(root.right)));
    }
}

public class MaximumInBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(15);
        root.left.left = new Node(30);
        root.right = new Node(20);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.left.left = new Node(60);
        root.right.left.right = new Node(70);
        int max = new MaximumInBinaryTreeSolution().max(root);
        System.out.println(max);
    }
}
