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

    public void setage(int age)throws Exception
        {  try
            {
                if(age<0)
                throw new Exception("You entered a age less than 0");
            else
                this.age=age;
            }
            catch( Exception e)
            {
                e.printStackTrace();
            }

        }  

    // public void setage(int age)throws Exception
    //  {
    //     if(age<0)
    //         throw new Exception("You entered a age less than 0");
    //     else
    //         this.age=age;
    //  }    
     public int getAge() {
         return age;
     }
     public String getName() {
         return name;
     }

}

class Dmain
{
    public static void main(String[] args)throws Exception
    {
        exception_handeling obj = new exception_handeling();
        obj.setage(-9);
        obj.setname("Shubham");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
