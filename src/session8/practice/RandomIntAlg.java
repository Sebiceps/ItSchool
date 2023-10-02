package session8.practice;

import java.util.Random;

public class RandomIntAlg {

    public static void main(String[] args) {
        printRandomNumbers();
    }

    public static void printRandomNumbers(){
        Random random = new Random();
        int randomNumber = random.nextInt(1,17);
        System.out.println("Random number: " + randomNumber);
    }
}
