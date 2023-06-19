class A
{
    void add()
    {
        int a = 10 , b = 20 , c ;

        c = a+b ;

        System.out.println(c);
    }
    
    void add(int x , int y )
    {
        int  c ;
        c = x+y ;
        System.out.println(c);
    }

}

public class mover 
{
    public static void main(String[] args) {
        A a = new A();
        a.add();
        a.add(30 , 40);
    }
    
}