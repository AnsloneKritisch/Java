// Super keyword reffers to the objects of super class , it is used when we want to access the properties of super class & contructor 


class A // super class
{
    int a = 10;
    
}
// B extends A that means that It can access all the variable all the function of  class A
class B extends A
{
    int a = 20;

    void show()
    {
        System.out.println(a);
        // if we print a it will print 20 not a because it will priperty of class itself class not a 

        // to print A varible we have to use super keyword

        System.out.println(super.a);
    }
}



public class sk 
{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }


    
}


