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
    void add()
    {
        System.out.println(a + 10);
    }

}

class C extends A
{
    void sub()
    {
        System.out.println(a - 10);
    }

}


public class hirein05 {

    public static void main(String[] args) 
    {
        B obj1 = new B();
        C obj2 = new C();

        obj1.input();
        obj1.add();
        
        
        obj2.input();
        obj2.sub();
        

    }


    
}
