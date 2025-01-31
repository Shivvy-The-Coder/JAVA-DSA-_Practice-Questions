package AnotherBT;
import java.util.*;

public class Q199RightView {

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

    class Solution{
        public List<Integer> rightSideView (TreeNode root)
            {
                List<Integer> ans = new ArrayList<>();
                RightView(root, 1, ans);
                return ans;
            }
            int maxdepth=0;
        public void RightView(TreeNode root , int curr,List<Integer> ans)

            {
                if(root==null)
                    return;
                    
                    if(maxdepth<curr)
                        {
                            ans.add(root.val);
                            maxdepth=curr;
                        }
                    RightView(root.right, curr+1, ans);
                    RightView(root.left,  curr+1, ans);
            }
    }
}
