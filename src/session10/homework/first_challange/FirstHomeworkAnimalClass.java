// Create an Animal class with sound() method that prints to console “animal makes sounds”
// Create a Dog class that extends Animal and overrides sound() method; dogs make a particular sound, so we want to print “bark”, in this case
// Create a Cat class that extends Animal and overrides sound() method, and in this case, we want to print in our method “meow”
// Create a Wolf class that extends Animal, and overrides sound() method, and print “how”


        package session10.homework.first_challange;

public class FirstHomeworkAnimalClass {
}

class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
class Cat extends Animal {
    @Override
    void sound(){
        System.out.println("Meaw");
    }
}
class Wolf extends Animal{
    @Override
    void sound(){
        System.out.println("How");
    }
}