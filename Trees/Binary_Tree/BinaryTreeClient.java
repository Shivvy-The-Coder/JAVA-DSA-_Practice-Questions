package Binary_Tree;
public class BinaryTreeClient
{
    public static void main(String[] args) 
    {
        // Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.Display();    
        bt.ReturnGreatest();
        bt.ReturnSmallest();
        bt.Find(90);
        bt.height();
        bt.Preorder();
        bt.InOrder();
        bt.PostOrder();
        bt.LevelOrder();
        bt.RightView();
        bt.LeftView();
        bt.LeftestNode_fromroot();
    }
}
