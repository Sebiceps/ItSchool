package session10.homework.second_challange.Boats;

public class Watercraft {
}

class Boat{
    private double lenght;
    private double weight;
void sail(){
    System.out.println("You can sail free now.");
}

}

class SpeedBoat extends Boat{
    private double maxSpeed;
    private int engineType;

    void turboBoost(){
        System.out.println("Turbo boost increased.");
    }
}

class FishingBoat extends Boat{
    private double fishCapacity;
    private int typeOfNet;

    void castNet(){
        System.out.println("The net has been deployed");
    }
}