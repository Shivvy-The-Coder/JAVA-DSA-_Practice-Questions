package AnotherBT;
import java.util.*;
class Q199Leetcode {
 
    public List<Integer> rightSideView(TreeNode root)

    {
        List<Integer> ll = new ArrayList<>();
        if (root == null)
            return ll;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while (!qu.isEmpty()) {
            int Size = qu.size();

            for (int i = 0; i < Size; i++) {
                TreeNode curr = qu.remove();
                System.out.println(curr.val);
                if (i == (Size - 1))
                    ll.add(curr.val);

                if (curr.left != null)
                    qu.add(curr.left);
                if (curr.right != null)
                    qu.add(curr.right);

            }

        }
        return ll;
    }
}
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
 
