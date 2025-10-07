import tree.Node;

class OrderTraversalSolution {
    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    int height(Node root) {
        if (root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}


public class InorderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        new OrderTraversalSolution().inOrder(root);
        System.out.println();
        new OrderTraversalSolution().preOrder(root);
        System.out.println();
        new OrderTraversalSolution().postOrder(root);
        System.out.println();
        int height = new OrderTraversalSolution().height(root);
        System.out.println(height);
    }
}
