import java.util.*;

public class Letter_combination_of_a_phoneNumber 
{    static String []arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args)
     {          
        List<String> ll = new ArrayList<>();
        String ques ="237";
        if(ques.length()==0)
            System.out.println();
        combine(ques,"",ll);  
        System.out.println(ll);  
        }      
    public static void combine(String ques , String ans, List<String> ll)
        {   
            if(ques.length()==0)
                {ll.add(ans);
                return;
                }
                char ch=ques.charAt(0);
                String press =arr[ch-'0'];
                for(int i=0;i<press.length();i++)
                    {
                        combine(ques.substring(1),ans+press.charAt(i),ll);
                    }
        }  
}
