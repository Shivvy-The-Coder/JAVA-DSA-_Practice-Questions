/**
 * exception_handeling
 */
public class exception_handeling {

    private String name="Shivam";
    private int age = 19;

    public void setname(String name )
        {
            this.name = name;
        }
    public void setage(int age)
     {
        this.age=age;
     }    
     public int getAge() {
         return age;
     }
     public String getName() {
         return name;
     }

}

class main
{
    public static void main(String[] args) {
        exception_handeling obj = new exception_handeling();
        obj.setage(-9);
        obj.setname("Shubham");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
