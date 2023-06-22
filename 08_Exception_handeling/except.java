public class except 
{
    public static void main(String[] args) {
        
        System.out.println("Starting the program");

        int a = 10 , b = 0 , c ;

        try 
        {
            c = a/b;
            System.out.println(c);
        }
        
        catch (ArithmeticException e)
        {
            System.out.println("Can't divide by zero");
        }

        System.out.println("End of program");
    }
}
   