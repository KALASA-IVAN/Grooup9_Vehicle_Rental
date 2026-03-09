package services;

import java.util.ArrayList;
import java.util.List;

import models.Vehicle;
import interfaces.Rentable;
import exceptions.VehicleUnavailableException;

public class RentalService implements Rentable {

    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void displayVehicles() {

        System.out.println("\n------------------------------------------------------");
        System.out.printf("%-5s %-15s %-15s %-10s\n",
                "ID", "Brand", "Price/Day", "Available");
        System.out.println("------------------------------------------------------");

        for (Vehicle v : vehicles) {

            System.out.printf("%-5d %-15s %-15.2f %-10s\n",
                    v.getId(),
                    v.getBrand(),
                    v.getPricePerDay(),
                    v.isAvailable());
        }

        System.out.println("------------------------------------------------------");
    }

    @Override
    public void rentVehicle(int vehicleId, int days)
            throws VehicleUnavailableException {

        for (Vehicle v : vehicles) {

            if (v.getId() == vehicleId) {

                if (!v.isAvailable()) {
                    throw new VehicleUnavailableException("Vehicle not available.");
                }

                v.setAvailable(false);

                double fee = v.calculateFee(days);

                System.out.println("Vehicle rented successfully.");
                System.out.println("Total fee: " + fee);

                return;
            }
        }

        System.out.println("Vehicle not found.");
    }

    @Override
    public void returnVehicle(int vehicleId) {

        for (Vehicle v : vehicles) {

            if (v.getId() == vehicleId) {

                v.setAvailable(true);

                System.out.println("Vehicle returned successfully.");
                return;
            }
        }
    }
}