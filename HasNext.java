import java.util.*;
public class HasNext {

    public static void input(Scanner sc )
    {
        System.out.println("Enter the LIne ");
        String line = sc.nextLine();
        Scanner s = new Scanner(line);
            List<Integer> arr = new ArrayList<>();
            while(s.hasNextInt())
                {
                    arr.add(s.nextInt());
                }
            s.close();
                System.out.println("Array size "+arr.size());
            for (int i:arr)
                {
                    System.out.println(i);
                }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input(sc);
        sc.close();
    }
}
