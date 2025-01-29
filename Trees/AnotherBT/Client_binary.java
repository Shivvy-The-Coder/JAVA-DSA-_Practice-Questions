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
    }    
}

// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true  70 false false false
