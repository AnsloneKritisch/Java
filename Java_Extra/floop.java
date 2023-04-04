// Created an abstract class
abstract class floop
{
    public String name = "Ritu";
    public int age = 21 ;
    // Created abstract methord to collect data
    public abstract void love();

}
// Created a sub classs of abstract class

class tut extends floop
{
    public int year = 2024 ;
    // if my data is abstracted it will be printed
    public void love()
    {
        System.out.println("She is beautiful");
    }
    
}




