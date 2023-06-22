public class thd implements Runnable
{
    public static void main(String[] args)
    {
    
        thd obj = new thd();
        Thread t = new Thread(obj);
        t.start();
        // If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method
        
        System.out.println("this code inside the thread");

    }

    public void run()
    {
        System.out.println("this code outside the thread");
    }

}