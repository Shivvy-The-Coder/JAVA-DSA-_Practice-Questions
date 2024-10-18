public class static_keyword {
    
    String name="Shivam";
    int age=19;
    public void answer()
    {
        System.out.println("My name is "+name +" and age is "+age);
    }
}

class Main
{
    public static void main(String[] args) 
    {
        static_keyword obj = new static_keyword();
        obj.answer();    
    }
}