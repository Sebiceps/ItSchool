//Exploring Different Types of Inheritance with the "Vehicles" Domain Model
//For this exercise, we'll dive into the world of vehicles.
// Your task is to design three separate packages in Java to demonstrate the three types of inheritance: Single, Multilevel, and Hierarchical.

//Package 1: Single Inheritance

package session10.Homework.SecondChallange.Bicycle;

public class Bicycles {
}

class Bicycle {
    private int speed;
    private int gear;

    void changeGear(){
        System.out.println("Plase change the gear");
    }
    void speedUp(){
        System.out.println("You're increasing speed, slow down! ");
    }
    void applyBrake(){
        System.out.println("You're going too fast, apply brakes!");
    }
}

class MountainBike extends Bicycle{
    private int tireType;
    private int suspension;

    void adjustSuspension(){
        System.out.println("You are riding to a different terrain, adjust suspension!");
    }
}