package main;

import java.util.Scanner;

import models.Car;
import models.Bike;
import services.RentalService;
import exceptions.VehicleUnavailableException;
import utils.ConsoleUI;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RentalService service = new RentalService();

        // Cars
        service.addVehicle(new Car(1, "Toyota Corolla", 100));
        service.addVehicle(new Car(2, "Honda Civic", 120));
        service.addVehicle(new Car(3, "BMW X5", 200));
        service.addVehicle(new Car(4, "Mercedes Benz GLE", 250));
        service.addVehicle(new Car(5, "Audi Q7", 230));
        service.addVehicle(new Car(6, "Volkswagen Passat", 150));

        // Bikes
        service.addVehicle(new Bike(7, "Yamaha R1", 80));
        service.addVehicle(new Bike(8, "Kawasaki Ninja", 90));
        service.addVehicle(new Bike(9, "Honda CBR", 85));
        service.addVehicle(new Bike(10, "Suzuki GSXR", 88));

        ConsoleUI.printBanner();

        while (true) {

            ConsoleUI.printMenu();

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    ConsoleUI.info("Available Vehicles:");
                    service.displayVehicles();
                    break;

                case 2:

                    System.out.print("Enter Vehicle ID: ");
                    int id = scanner.nextInt();

                    System.out.print("Enter days: ");
                    int days = scanner.nextInt();

                    try {
                        service.rentVehicle(id, days);
                        ConsoleUI.success("Vehicle rented successfully!");
                    } catch (VehicleUnavailableException e) {
                        ConsoleUI.error("Error: " + e.getMessage());
                    }
                    break;

                case 3:

                    System.out.print("Enter Vehicle ID: ");
                    int rid = scanner.nextInt();

                    service.returnVehicle(rid);

                    ConsoleUI.success("Vehicle returned successfully!");
                    break;

                case 4:

                    ConsoleUI.info("Thank you for using the system.");
                    System.exit(0);
            }
        }
    }
}