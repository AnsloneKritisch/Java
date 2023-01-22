import java.util.Scanner;

public class cond2
{
    public static void main(String[] args)
    {
        int a , b ;

        System.out.print("Enter first number : ");
        Scanner p = new Scanner(System.in);
        a = p.nextInt();

        System.out.print("Enter second number : ");
        Scanner q = new Scanner(System.in);
        b = q.nextInt();

        if (a>b)
        {
            System.out.println(a+" is greater"+b);
            
        }
        else if (a==b)
        {
            System.out.println(a+ " is equal to " +b);
            
        }
        
        else
        {
            System.out.println(b+" is greater than "+a);
        }





        
    }
    
    
}
