package models;

public class Car extends Vehicle {

    public Car(int id, String brand, double pricePerDay) {
        super(id, brand, pricePerDay);
    }

    @Override
    public double calculateFee(int days) {
        return days * pricePerDay;
    }
}