import java.util.HashSet;
import java.util.Scanner;

public class hs {

    public static void main(String[] args) {
        
        HashSet <Integer> stud = new HashSet<Integer>() ;

        System.out.print("Enter how many numbers want to Store: ");
        Scanner  a = new Scanner(System.in);
        int n = a.nextInt();

        
        
        

        for(int i = 1 ; i <= n ; i++)
        {
            System.out.print("Enter the " +i+ " name : ");
            Integer name = a.nextInt();
            stud.add(name);

        }
        
        int big = 0 ;
        
        for( Integer i : stud)
        {
            if( i > big)
            {
                big = i ; 
            }
        }
        System.out.println( "The Biggest NUmber is = " +big);
       
        
        for(Integer i : stud)
        {
            if( i < big)
            {
                big = i ;
            }
        }
        
        System.out.println( "The smallest Number is = " +big);

        System.out.print(" Which number you want to Check: ");
        int ch = a.nextInt();

        System.out.println(stud.contains(ch));

    }

    

   
    
}
