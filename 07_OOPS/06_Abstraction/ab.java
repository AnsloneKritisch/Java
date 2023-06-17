// The things which are common in both the class then we use abstract class

abstract class Animal
{
    public abstract void sound() ;
}

class dog extends Animal
{
    public void sound()
    {
        System.out.println("Bark");
    }

}

class lion extends Animal
{
    public void sound()
    {
        System.out.println("Roar");
    }

}

public class ab {

    public static void main(String[] args) 
    {
        dog d = new dog();
        lion l = new lion();
        d.sound();
        l.sound();
    
    }

}
