package Binary_Tree;
import java.util.LinkedList;
import java.util.Queue;
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

    public int ReturnGreatest(Node root)
        {
            if(root.left==null && root.right==null)
                return root.data;
            int leftmax = ReturnGreatest(root.left);
            int rightmax = ReturnGreatest(root.right);
            
            return Math.max(root.data,Math.max(leftmax,rightmax));
        }

    public void ReturnGreatest()
        {
            System.out.println(ReturnGreatest(root));
        }
    public int ReturnSmallest(Node root)
        {
            if(root.left==null && root.right==null)
                return root.data;
            int leftmax = ReturnSmallest(root.left);
            int rightmax = ReturnSmallest(root.right);
            
            return Math.min(root.data,Math.min(leftmax,rightmax));
        }

    public void ReturnSmallest()
        {
            System.out.println(ReturnSmallest(root));
        }

    public void Find(int value)
        {
            System.out.println(Find(root,value));
        }

        public boolean Find(Node root , int value)
        {
            if(root==null)
                return false;
            
                if(root.data==value)
                return true;
            boolean checkLeft  = Find(root.left,value);
            boolean checkRight = Find(root.right,value);

            return checkLeft||checkRight;
        }
    
    public void height()
        {
            System.out.println(height(root));
        }

    public int height(Node root)
        {
            if(root==null)
                return -1;
            
            int Leftheight= height(root.left);
            int rightheight= height(root.right);

            return Math.max(Leftheight,rightheight)+1;
        }

    public void Preorder()
        {
            System.out.println("PreOrder Traversal is ");
            Preorder(root);
            System.out.print("NULL");
        }
    public Node Preorder(Node nn)
        {
            if(nn==null)
                return null;
            
            System.out.print(nn.data+"->");
            Preorder(nn.left);
            Preorder(nn.right);
        
            return nn;
        }
    public void InOrder()
    {
        System.out.println("\n InOrder Traversal is ");
        InOrder(root);
        System.out.print("NULL");
    }

    public Node InOrder(Node nn)
    {
        if(root==null)
            return null;     
        if(nn.left!=null)  
        InOrder(nn.left);
        System.out.print(nn.data+"->");
        if(nn.right!=null)  
        InOrder(nn.right);
        return nn;
    }

    public void PostOrder()
        {
            System.out.println("\n PostOrder Traversal is ");
            PostOrder(root);
            System.out.print("NULL");
        }

    public Node PostOrder(Node nn)
    {
        if(nn==null)
            return null;
        
        PostOrder(nn.left);
        PostOrder(nn.right);
        System.out.print(nn.data+" ->");
        return nn;
    }

    public void LevelOrder()
        {
            System.out.println("\n LEVEL ORDER TRAVERSAL");
            LevelOrder(root);
            System.out.print("NULL");
        }
    public void LevelOrder(Node nn)
        {
            Queue <Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty())
                {
                    Node n = q.remove();
                    System.out.print(n.data+"->");
                    if(n.left!=null)
                        q.add(n.left);
                    if(n.right!=null)
                        q.add(n.right);
                }
            

        }

}
// 10 true 5 true 3 false false true 7 false false true 15 true 12 false false true 18 false false