class bank
{

    private int pin = 1234;
    public int  acc = 4428 ;
    void display()
    {
        System.out.println("Your pin number is "+pin);
        System.out.println("Your account number is "+acc);
    }


}


public class encap {

    public static void main(String[] args)
    {
        bank b = new bank();
        b.display();

        System.out.println(b.acc);
        //  you cant print the pin as you know it's private and cant be accessed as it is encapsulated
        // System.out.println(b.pin);
    }


    
}