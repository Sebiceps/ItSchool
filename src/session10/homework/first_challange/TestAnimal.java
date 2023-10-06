//Create a TestAnimal Class with a main method, create objects with each animal class created (dog, cat, wolf) and call sound()

package session10.homework.first_challange;

public class TestAnimal {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();

        System.out.println("Dogs do the sound: ");
        dog.sound();
        System.out.println("Cats do the sound: ");
        cat.sound();
        System.out.println("Wolfs do the sound: ");
        wolf.sound();
    }
}
