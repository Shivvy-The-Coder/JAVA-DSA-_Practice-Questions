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

    public BinaryTree()
        {
            root=CreateTree();
        }
    public Node CreateTree()
        {
            Node nn = new Node();
            Scanner sc = new Scanner(System.in);
            int value=sc.nextInt();
            nn.val=value;

            Boolean hlc= sc.nextBoolean();
            if(hlc)
                nn.left=CreateTree();
            
            Boolean hrc= sc.nextBoolean();
            if(hrc)
                nn.Right=CreateTree();

            sc.close();
            return null;
        }
}