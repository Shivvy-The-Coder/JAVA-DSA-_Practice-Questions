package Trees;
import java.util.Scanner;

class BinaryTree
{
    class Node
    {
        int val;
        Node left;
        Node Right;
    }
    private Node root;
    Scanner sc = new Scanner(System.in);
    public BinaryTree()
        {
            root=CreateTree();
        }
    public Node CreateTree()
        {
            Node nn = new Node();
            int value=sc.nextInt();
            nn.val=value;

            Boolean hlc= sc.nextBoolean();
            if(hlc)
                nn.left=CreateTree();
            
            Boolean hrc= sc.nextBoolean();
            if(hrc)
                nn.Right=CreateTree();
            return nn;
        }
    public void Display()
        {
            Display(root);
        }
    private void Display(Node nn)
        {
            if(nn==null)
                return;
            String s="";
            s=" <- "+nn.val+" -> ";
            if(nn.left!=null)
                {
                    s=nn.left.val+s;
                }
            else
                s="."+s;
            
            if(nn.Right!=null)
                {
                    s=s+nn.Right.val;
                }
            else
                s=s+".";
            System.out.println(s);
            Display(nn.left);
            Display(nn.Right);
           
        }

    // this will find the maximum value present in the tree
    public int max()
        {return  max(this.root);
        }
    private int max (Node nn)
        {
            if(nn ==null)
                return Integer.MIN_VALUE;
            int lmax = max(nn.left);
            int rmax = max(nn.Right);
            return  Math.max(nn.val,Math.max(lmax,rmax));
        }

    // this will find the minimum value present int the treee
    public int  min()
    {return  min(this.root);}
    private int min(Node nn)
        {
            if(nn ==null)
                return Integer.MAX_VALUE;
            int lmin = min(nn.left);
            int rmin = min(nn.Right);
            return Math.min(nn.val,Math.min(lmin,rmin));
        }

    // this will find and tell wether a perticlar value exists in  the Binary Tree or not

    public boolean  find(int value)
        {
           return find(this.root,value);
        }
    private boolean  find(Node nn,int val)
        {
            if(nn==null)
                return  false;

            if (nn.val==val)
                return true;
            
            boolean lfind = find(nn.left, val);
            boolean rfind = find(nn.Right, val);

            if (lfind ||rfind)
                return true;
            return false;
        }

    // this code will return the height od the binary tree

    public int height()
        {
            return  height(this.root);

        }
    private int height(Node nn)
        {   
            if(nn==null)
                return 0;
            
            int lheight = height(nn.left);
            int rheight = height(nn.Right);

            return Math.max(lheight,rheight)+1;
        }

    // Given Below code will print the preorder traversal of the Binary tree

    public void preorder()
        {
            preorder(this.root);
        }
    private void preorder(Node nn)
        {
            if(nn==null)
             return ;
            
            System.out.print(nn.val+" ");
            preorder(nn.left);
            preorder(nn.Right);
        }

    // Given below code will print the Inorder traversal of the binary Tree
    public void inorder()
    {
        System.out.println();
        inorder(this.root);
    }
private void inorder(Node nn)
    {
        if(nn==null)
         return ;
        
         inorder(nn.left);
         System.out.print(nn.val+" ");
         inorder(nn.Right);
    }
    // Given below code will print the Postorder traversal of the binary Tree
    public void postorder()
    {
        System.out.println();
        postorder(this.root);
    }
private void postorder(Node nn)
    {
        if(nn==null)
         return ;
        
         postorder(nn.left);       
         postorder(nn.Right);
         System.out.print(nn.val+" ");
    }
}
