import tree.Node;

class SizeOfBinaryTreeSolution {
    int size(Node root) {
        if (root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);
    }
}

public class SizeOfBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(15);
        root.left.left = new Node(30);
        root.right = new Node(20);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.left.left = new Node(60);
        root.right.left.right = new Node(70);

        int size = new SizeOfBinaryTreeSolution().size(root);
        System.out.println(size);

    }
}
