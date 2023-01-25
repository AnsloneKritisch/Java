import java.util.Scanner;

public class basic
{
    public static void main(String[] args)
    {
        int a , i  ; 
        System.out.print("Enter till which number you want : ");
        Scanner p = new Scanner(System.in) ;
        a = p.nextInt();

        for(i=1; i<=a ; i++)
        {
           System.out.println(i); 
        }
        
    }
    
}


