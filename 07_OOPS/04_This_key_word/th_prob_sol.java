class A 
{
    
    int a;

    A(int a) 
    {
        // if you don't use this keyword it will print 0 beacuse it cannot access the a varible so we use this as obj 
        
        this.a = a;

    }

    void show() 
    {
        System.out.println(a);
    }
}

public class th_prob_sol 
{

    public static void main(String[] args) 
    {
        A obj = new A(10);
        obj.show();
    }
}