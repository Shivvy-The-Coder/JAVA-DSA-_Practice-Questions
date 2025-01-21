package Binary_Tress;
import java.util.*;
class client_Binary 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        // System.out.println("Hellu");
        BinaryTree obj =new BinaryTree();
        obj.Display();
        System.out.println("Maximum  value of the given Binary Tree is "+obj.max());
        System.out.println("Maximum  value of the given Binary Tree is "+obj.min());
        
        System.out.println("Enter the value to search ");
        int value = sc.nextInt();
        if(obj.find(value))
            System.out.println("yes, "+value+" available");
        else
            System.out.println("Not available");

        System.out.println("Height of Tree "+obj.height());

        obj.preorder();
        obj.inorder();
        obj.postorder();
        obj.levelOrder();
        sc.close();
    }

    @Override
    public String toString() {
        return "client_Binary []";
    }
}
// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
