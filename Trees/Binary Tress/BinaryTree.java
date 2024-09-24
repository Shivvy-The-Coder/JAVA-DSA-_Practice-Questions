import java.util.Scanner;

public class BinaryTree 
{
    public class Node
    {
        int val;
        Node left;
        Node right;
    }  
    private Node root;  
    Scanner sc = new Scanner(System.in);

    public BinaryTree()
        {
            root = CreateTree();
        }
}
