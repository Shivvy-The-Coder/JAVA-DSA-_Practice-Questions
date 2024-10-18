/**
 * cl
 */
class x
{
    int a;
    String name;
    x(){
      a=7;
      name="ayush";
    }
    x(int b,String s){
        a=b;
        name=s;
    }
}
public class cl {

    
    public static void main(String[] args) {
        x obj = new x();
        System.out.println(obj.a);
        System.out.println(obj.name);
    }
}
