package AnotherBT;

public class TwoBinaryTreeExactlySameStructure {

    public boolean checkSymmetric(TreeNode root1, TreeNode root2) {

        // checking id the trees or the Subtrees at that postion are empty, then they have same Structure
        if (root1 == null && root2 == null)
            return true;
        // if one of the subtree have null but another contains some node than that means the tree are not strctured in smae way , therefor ghey are not same Strcutured
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

