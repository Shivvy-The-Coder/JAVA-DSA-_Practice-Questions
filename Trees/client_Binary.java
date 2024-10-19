package Trees;
class client_Binary 
{
    public static void main(String[] args) {
        BinaryTree obj =new BinaryTree();
        obj.Display();
        System.out.println("Maximum  value of the given Binary Tree is "+obj.max());
        System.out.println("Maximum  value of the given Binary Tree is "+obj.min());
    }
}
// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
