package models;

public class Bike extends Vehicle {

    public Bike(int id, String brand, double pricePerDay) {
        super(id, brand, pricePerDay);
    }

    @Override
    public double calculateFee(int days) {
        return days * pricePerDay * 0.8;
    }
}