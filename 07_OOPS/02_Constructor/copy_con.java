public class copy_con {

    
        int a , b;

        copy_con()
        {
            a = 10;
            b = 20;
        }

        copy_con( copy_con ref)
        {
            a = ref.a;
            b = ref.b;

            System.out.println(a+" "+b);
        }

    

    public static void main(String[] args) 
    {
 
        copy_con obj = new copy_con();
        copy_con obj1 = new copy_con(obj);  

    }
    
}
