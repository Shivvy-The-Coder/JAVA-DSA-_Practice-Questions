package BinarySearchTree;

public class Binary_Search_Tree {
    
    class Node 
    {
        int val;
        Node left;
        Node right;
    }
    private Node root;

    public Binary_Search_Tree( int [] in)
        {
            root = CreateTree(in, 0 ,in.length-1 );
                
        }
    private Node CreateTree(int[] in, int si, int ei)
    {
        if(si>ei)
            return null;

        int mid =(si+ei);
        // below will create the node where the data is needed to be stored
        
        Node nn =new Node();
        nn.val=in[mid];

        nn.left=CreateTree(in, si, mid-1);
        nn.right=CreateTree(in, mid+1, ei);
        return nn;
    }

    public void Display()
        {
            Display(root);
        }
    private void Display(Node nn)
        {
            if (nn==null)
                return;
            String s = " <- "+nn.val+" -> ";
            if(nn.left!=null)
                s=nn.left.val+s;
            else
                s="null"+s;
            if(nn.right!=null)
                s+=nn.right.val;
            else
                s=s+"null";

            System.out.println(s);
            Display(nn.left);
            Display(nn.right);
        }   
}
