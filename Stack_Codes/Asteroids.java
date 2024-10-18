package Stack_Codes;
import java.util.Stack;
class asteroids {
    public static void main(String[] args) {
        int [] Asteroids={5,10,-5};
        asteroidCollision(Asteroids);
    }
    public static int[] asteroidCollision(int[] asteroids) 
    {
     int n=asteroids.length;
    Stack <Integer> st = new Stack<>();
    //  int []ans = new int[asteroids.length];
     for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && asteroids[i]*st.peek()<0)
                {
                    if(Math.abs(asteroids[i])>Math.abs(st.peek()))
                        st.pop();
                }
            st.push(asteroids[i]);
            
        }    
        System.out.println(st);
    return asteroids;
    }
}