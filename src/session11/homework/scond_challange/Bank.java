package session11.homework.scond_challange;

public abstract class Bank {

    private double getBalance;
}

class BankA extends Bank {
    private void deposit(double amount) {
        double getBalance = 100;
        System.out.println("You deposited: " + getBalance);
    }

    class BankB extends Bank {
        private void deposit(double amount) {
            double getBalance = 150;
            System.out.println("You deposited: " + getBalance);
        }
    }

    class BankC extends Bank{
        private void deposit(double amount){
            double getBalance = 200;
            System.out.println("You deposited: " + getBalance);
        }
    }
}