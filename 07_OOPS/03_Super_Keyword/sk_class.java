// Super keyword reffers to the objects of super class , it is used when we want to access the properties of super class & contructor 


class A // super class
{
    int a = 10;

    void show()
    {
        System.out.println("This is super class");
    }
    
}
// B extends A that means that It can access all the variable all the function of  class A
class B extends A
{
    int a = 20;

    void show()
    {
        super.show();
        System.out.println(a);
        System.out.println(super.a);

    }
}



public class sk_class
{
    public static void main(String[] args) {
        B obj = new B();
        obj.show(); // it will call the show function in B class no the super class so we are going to call it in super class in B
    }


    
}

