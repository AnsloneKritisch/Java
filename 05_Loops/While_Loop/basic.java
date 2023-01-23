import java.util.Scanner;

public class basic
{
    public static void main(String[] args)
    {
        int i , a ;

        System.out.print("Enter a number : ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();

        i = 1 ;
        while (i<=a)
        {
            System.out.println(i);
            i++ ;
            
        }
        
    }

    
}
