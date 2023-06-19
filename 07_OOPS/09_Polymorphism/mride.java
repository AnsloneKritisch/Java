class A
{
    void show()
    {
        System.out.println("Ride it baby!");
    }
}

class B extends A
{

    @Override // just remind the programmer that this method is overriding the parent class method

    // even if we don't right override the program will nbe fine 
    
    void show()
    {

        System.out.println("Ride it hard baby! ");

    }
}

public class mride
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();

        
    }

}