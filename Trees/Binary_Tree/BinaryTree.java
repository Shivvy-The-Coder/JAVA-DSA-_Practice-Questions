package Binary_Tree;
import java.util.Scanner;
public class BinaryTree
{
    public class Node
    {
        Node left;
        Node right;
        int data;
    }
    private Node root;
    Scanner sc = new Scanner(System.in);


    public BinaryTree()
        {
            root=CreateBinaryTree();
        }
    public Node CreateBinaryTree()
        {
            Node nn = new Node();
            int data = sc.nextInt();

            nn.data = data;
            
            boolean hlc = sc.nextBoolean();
            if(hlc)
                nn.left=CreateBinaryTree();
            else    
                nn.left=null;
            
                boolean hrc = sc.nextBoolean();
            if(hrc)
                nn.right=CreateBinaryTree();
            else    
                nn.right=null;
            
            return nn;
        }
    
    public void Display()
        {
            Display(root);
        }
        private void Display(Node root)
        {
            if(root.left==null && root.right==null)
                {
                    return;}
            String str ="<-"+root.data+"->";

            if(root.left!=null)
                str=root.left.data+str;
            else
                str=" null"+str;
            
            if(root.right!=null)
                str=str+root.right.data;
            else
                str=str+" null";
            System.out.println(str);
            Display(root.left);
            Display(root.right);
        }

}