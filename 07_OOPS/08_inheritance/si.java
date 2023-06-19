class A
{
    int a ;

    void input()
    {
        a = 10;
    }

}

class B extends A
{
    void display()
    {
        System.out.println(a);
    }
}

public class si
{
    public static void main(String[] args) 
    {
        B obj = new B();
        obj.input();
        obj.display();

    }

    
}