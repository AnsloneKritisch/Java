import java.util.Scanner;

public class input 
{
    public static void main(String[] args)
    {
        int a , b , c;

        Scanner s = new Scanner(System.in);
        

        System.out.print("Enter first number :"); 
        a = s.nextInt();

        System.out.print("Enter second number :");
        b = s.nextInt();

        System.out.print("Press 1 for Addition \n Press 2 for Subtraction \n Press 3 for Multiplication \n Press 4 for Division \n ");

        System.out.print("Choose what do you want to do  :");
        c = s.nextInt();

        if (c == 1)
        {
            System.out.println(a+b);            
        }

        else if (c == 2)
        {
            System.out.println(a-b);
        }

        else if (c == 3)
        {
            System.out.println(a*b);
        }

        else if (c == 4)
        {
            System.out.println(a/b);
        }
        
        else
        {
            System.out.println("Choose the right option ");
        }
        

    }
    
}
