class A
{
    int a , b , c ;

    void input()
    {
        a = 10;
        b = 20;
    }

}

class B extends A
{
    void display()
    {
        System.out.println("Display -> "+a+" , "+b);
    }
}

class C extends B
{
    void add()
    {
        c = a+b ;
        System.out.println("Add -> "+ c);
    }

}


public class simulti 
{
    public static void main(String[] args) 
    {
        C obj = new C();
        obj.input();
        obj.display();
        obj.add();

    }


    
}
