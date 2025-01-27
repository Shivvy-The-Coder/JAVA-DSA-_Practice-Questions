package AnotherBT;

import java.util.Scanner;

public class BinaryTree {

    class Node 
    {
        int data;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);
    public BinaryTree()
        {
            root=createTree();
        }

    public void Display()
        {
            Display(root);
        }

    private void Display(Node root)
        {

                if(root==null)
                    return;
                
                String s = " <- " + root.data + " -> ";
                if(root.left!=null)
                    {
                        s=root.left.data+s;
                    }
                else
                    {
                        s=" NULL "+s;
                    }

                if(root.right!=null)
                    {
                        s=s+root.right.data;
                    }
                else
                    {
                        s+=" NULL ";
                    }
                System.out.println(s);
                Display(root.left);
                Display(root.right);
                
        }

    public Node createTree()
    {
        Node nn = new Node();
        int value=sc.nextInt();
        
        nn.data=value;

        Boolean hlc = sc.nextBoolean();
        if(hlc)
            nn.left=createTree();
        else    
            nn.left=null;
        
        Boolean hrc = sc.nextBoolean();
        if(hrc)
            nn.right=createTree();
        else    
            nn.right=null;

        return nn;
    }

}
