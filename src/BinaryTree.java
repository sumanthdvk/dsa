import java.util.List;

public class BinaryTree {

    public static BinaryTreeNode createBST(List<Integer> list) {
        BinaryTreeNode root = new BinaryTreeNode();
        for (int i: list) {
            root = addRecursive(root, i);
        }
        return root;
    }

    private static BinaryTreeNode addRecursive(BinaryTreeNode current, int value) {
        if (current == null) {
            return new BinaryTreeNode(value);
        }

        if (value < current.data) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.data) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public static void displayLevelOrder(BinaryTreeNode node) {

    }
}
