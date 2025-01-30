package AnotherBT;

public class TwoBinaryTreeExactlySameStructure {

    public boolean checkSymmetric(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;

        boolean left = checkSymmetric(root1.left, root2.left);
        boolean right = checkSymmetric(root1.right, root2.right);

        return left && right;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

