package session10.homework.second_challange.Cars;

public class Car {
}

class Cars{
    private String make;
    private String model;
    private String year;

    void start(){
        System.out.println("The car has started.");
    }
    void stop(){
        System.out.println("The car stopped");
    }
    void accelerate(){
        System.out.println("You increased the speed");
    }
}

class ElectricCar extends Cars{
    private double batteryCapacity;
    private double range;

    void charge(){
        System.out.println("The car is charging");
    }
}

class Tesla extends ElectricCar{
    public void enableAutopilot(){
        System.out.println("Autopilot enabled.");
    }


}