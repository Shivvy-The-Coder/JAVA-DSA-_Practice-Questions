// import java.util.*;
// import java.io.*;
public class duplicateArray {
    public static void main(String args[])
        {
            String s="aabbii";
            String ans="";
            int x=98;
            for (int i=0;i<s.length();i++)
                {
                    char ch =s.charAt(i);
                    if(x==122)
                        {x=98;}
                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                        {
                            
                            while((char)x =='a'||(char)x =='e'||(char)x=='i'||(char)x =='o'||(char)x =='u')
                            {
                                x++;
                            }
                            ans+=(char)x;
                            x++;
                        }
                    else
                        ans+=ch;
                    
                }
                System.out.println(ans);
        }
}
