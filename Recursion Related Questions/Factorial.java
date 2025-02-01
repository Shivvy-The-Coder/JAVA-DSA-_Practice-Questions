public class Factorial
{
    public static void main(String []args)
        {
            System.out.println(factorial(5));
            System.out.println(factorial(0))
        }
    public static int factorial(int n)
        {
            if(n==0)
                return 1;
            return n*factorial(n-1);
            
        }
    public static int factorialcode2(int n)
        {
            if(n==0)
                return 1;
            int fn = factorial(n-1);
            return n*fn;
        }
}