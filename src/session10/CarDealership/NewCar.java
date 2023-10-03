package session10.CarDealership;

import java.time.LocalDate;

public class NewCar extends Car {

    private LocalDate expirationDate;

    public NewCar(String model, int year, double price, LocalDate expirationDate) {
        super(model, year, price);
        this.expirationDate = expirationDate;
    }

    public void printExpirationDate() {
        System.out.println(expirationDate);
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}