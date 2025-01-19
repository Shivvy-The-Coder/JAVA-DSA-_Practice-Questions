package Binary_Tree_Revesion;

import java.util.Scanner;
public class BinaryTree
{
    class Node
    {
        int val ;
        Node Left;
        Node Right ;
    }

    private Node root; 
    Scanner sc = new Scanner (System.in);

    public BinaryTree()
    {
        root = CreateTree();
    }
    private Node CreateTree()
    {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item ;


        Boolean hlc = sc.nextBoolean();
        if (hlc)
            nn.Left=CreateTree();
        Boolean hrc = sc.nextBoolean();
        if(hrc)
            nn.Right=CreateTree();

        return nn;
    }
    public void Display()
        {
            Display(root);
        }

    public void Display(Node nn)
    {
        if(nn.Left==null && nn.Right==null)
            return;
        String s="";
        s="<--"+s+nn.val+"-->";
        if(nn.Left!=null)
            s+=nn.Left.val+s;
        else
            s+="."+s;
        if(nn.Right!=null)
            s+=s+nn.Left.val;
        else
            s=s+".";
        System.out.println(s);
        Display(nn.Left);
        Display(nn.Right);
        
    }
}