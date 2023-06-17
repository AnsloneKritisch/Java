class A 
{
    void show()
    {
        System.out.println(this);

    }

}

public class th
{

    
    public static void main(String[] args) 
    {

        // let's create an object of class A
        A obj = new A();

        //Let's print the value of object 

        System.out.println(obj);

        //show function will print the value of this keyword
        obj.show();
    }
    
}
