public class var1
{
    int a = 10 ; //instance variable
    static int  b = 20 ; //Static Variable 

    public static void main(String[] args)
    {
        int c = 30 ; // Local Variable 

        System.out.print(c); 
        System.out.print(b); 
        // System.out.print(a); we can print instance variable like that
        // we need objects to print the system variable 

        var1 s = new var1();
        System.out.println(s.a);

    }
    

}