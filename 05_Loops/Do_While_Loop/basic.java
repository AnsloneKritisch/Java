import java.util.Scanner;

public class basic
{
    public static void main(String[] args)
    {
        int a , i ;
        System.out.print("Enter a number :");
        Scanner s  = new Scanner(System.in);
        a =  s.nextInt();
        i=0;
        do
        {
            System.out.println(i);
            i++;
            
        }
        while (i<=a);
        
    }

    
}
