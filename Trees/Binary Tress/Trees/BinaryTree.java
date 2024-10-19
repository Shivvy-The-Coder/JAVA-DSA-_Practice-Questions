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
}   