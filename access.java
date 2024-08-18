/** in java there are 4 acess specifier 
 * 1.public : data members/methods can be accessed outside of the class
 * 
 * 2.private : data members/method can be accessed only within the class
 * 3.default : data members/methods can data members or  member methofs can be accessed only withi the same package
 * 4.protected :
 * 
 * 
 * ENCAPSULATION :: wrapping of data and function together in a single unit is called Encapsulation
 * what we actually do data member are combine with data function this is gnerally used for setter 
 * and getter functions
 */


 public class access
 {
    private String name="Shivam";
    private int age =20;
    
    public void  access(String name , int age) 
    {
        this.name = name;
        this.age =age;
    }

    public void setname(String name )
        {
            this.name=name;
        }
    public String display()
    {
        return this.name; 
    }
 }


class main
 {
    public static void main(String[] args) {
        access  obj = new access();
        obj.setname("Abhishek");
        System.out.println(obj.display());        
    }
 }
