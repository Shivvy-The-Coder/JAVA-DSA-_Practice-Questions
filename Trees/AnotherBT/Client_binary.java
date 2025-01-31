package AnotherBT;

public class Client_binary
{
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.Display();
        bt.ReturnGreatest();
        bt.ReturnSmallest();
        System.out.println(bt.find(40));
        System.out.println(bt.find(90));
        bt.height();

        System.out.print(" Preorder   ->");
        bt.PreOrder();
        System.out.println();
        
        System.out.print(" Inorder    ->");
        bt.PostOrder();
        System.out.println();
        
        System.out.print(" PostOrder  ->");
        bt.InOrder();
        System.out.println();

        System.out.print(" LevelOrder ->");
        bt.LevelOrder();        
        System.out.println();
        
    }    
}

// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true  70 false false false
