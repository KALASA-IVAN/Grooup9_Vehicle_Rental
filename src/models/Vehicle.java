package models;

public abstract class Vehicle {

    protected int id;
    protected String brand;
    protected double pricePerDay;
    protected boolean available;

    public Vehicle(int id, String brand, double pricePerDay) {
        this.id = id;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.available = true;
    }

    public abstract double calculateFee(int days);

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Getter for price per day
    public double getPricePerDay() {
        return pricePerDay;
    }

    // Getter for availability
    public boolean isAvailable() {
        return available;
    }

    // Setter for availability
    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " Brand: " + brand +
                " Price/Day: " + pricePerDay +
                " Available: " + available;
    }
}