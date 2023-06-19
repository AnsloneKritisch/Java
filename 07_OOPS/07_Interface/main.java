class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override   // it overrides the makeSound() method
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class main {
    
    public static void main(String[] args)
    {
        
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal makes a sound

        Cat cat = new Cat();
        cat.makeSound(); // Output: Meow!

        Animal anotherAnimal = new Cat();
        anotherAnimal.makeSound(); // Output: Meow!
    }
}
