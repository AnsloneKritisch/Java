interface A 
{
    void show();
}

interface B 
{
    void show();
}

class C implements A, B
{
    public void show() 
    {
        System.out.println("This is MyClass");
    }
}




public class mulinter04
{
    public static void main(String[] args)
    {
         C obj = new C();
        obj.show();
    }
    
}
