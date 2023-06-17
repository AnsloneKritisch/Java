public class intro {


    // Staring Creating Class

    int age = 21 ;
    int weight =56 ;
    String color = "Light";


    void eat()
    {
        System.out.println("I am Eating!");
    }

    void sleep()
    {
        System.out.println("I am Sleeping!");
    }

    public static void main(String[] args) {
       
        // we create an object to access the class and obj helps in it
        intro obj = new intro();

        System.out.println(obj.age);
        System.out.println(obj.weight);

        obj.eat();
        obj.sleep();

    }
    
}
