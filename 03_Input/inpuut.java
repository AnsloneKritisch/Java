import java.util.Scanner;

public class inpuut
{
    public static void main(String[] args)
    {
        int a , b , c ;
        System.out.print("Enter any one number :");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        
        System.out.print("Enter any two number :");
        Scanner t=new Scanner(System.in);
        b=t.nextInt();

        c =a+b ;
        System.out.print(c);
        
    }

}
