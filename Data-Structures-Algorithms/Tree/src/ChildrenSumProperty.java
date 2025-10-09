import tree.Node;

class ChildrenSumPropertySolution {
    boolean isChildrenSum(Node root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        int sum = 0;
        if (root.left != null)
            sum += root.left.data;
        if (root.right != null)
            sum += root.right.data;
        return root.data == sum && isChildrenSum(root.left) && isChildrenSum(root.right);
    }
}

public class ChildrenSumProperty {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(15);
        root.left.left = new Node(30);
        root.right = new Node(20);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.left.left = new Node(60);
        root.right.left.right = new Node(70);

        boolean isSum =
        new ChildrenSumPropertySolution().isChildrenSum(root);
        System.out.println(isSum);
    }
}
