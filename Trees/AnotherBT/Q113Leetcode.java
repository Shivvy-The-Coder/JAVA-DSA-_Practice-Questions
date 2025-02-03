package AnotherBT;
import java.util.*;
  class TreeNode {
     int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
   }
   }

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        {
            List<Integer> Answer = new ArrayList<>();
            List<List<Integer>> AnswerList = new ArrayList<>();
            path(root, targetSum, Answer, AnswerList);
            return AnswerList;
        }
    }

    public void path(TreeNode root, int targetSum, List<Integer> Answer, List<List<Integer>> AnswerList) {
        if (root == null)
            return;
        Answer.add(root.val);

        if (root.left == null && root.right == null && targetSum - root.val == 0) {
            AnswerList.add(new ArrayList<>(Answer));
        }
        if (root.left != null)
            path(root.left, targetSum - root.val, Answer, AnswerList);
        if (root.right != null)
            path(root.right, targetSum - root.val, Answer, AnswerList);

        Answer.remove(Answer.size() - 1);
    }

}
