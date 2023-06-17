public class method {

    static void show()
    {
        System.out.println("Predefined method");
    }

    static int sum(int a ,int b  )
    {
        return(a+b);
    }

    public static void main(String[] args) {
        
        show();

        int a = sum(12 , 13);

        System.out.println(a);

    }

    
}
