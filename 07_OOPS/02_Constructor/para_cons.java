public class para_cons {

    int y ;

    public para_cons(int x)
    {
        y=x;

        System.out.println(y);
    
    }

    public static void main(String[] args) {
        
        para_cons obj = new para_cons(5);

        System.out.println(obj.y);

    }


    
}

