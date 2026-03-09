package utils;

public class ConsoleUI {

    // Colors
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";

    public static void printBanner() {

        System.out.println(CYAN);
        System.out.println("==============================================");
        System.out.println("        VEHICLE RENTAL MANAGEMENT SYSTEM      ");
        System.out.println("==============================================");
        System.out.println(RESET);
    }

    public static void printMenu() {

        System.out.println(BLUE + "\nMAIN MENU" + RESET);
        System.out.println("----------------------------------------------");
        System.out.println("1️⃣  View Vehicles");
        System.out.println("2️⃣  Rent Vehicle");
        System.out.println("3️⃣  Return Vehicle");
        System.out.println("4️⃣  Exit");
        System.out.println("----------------------------------------------");
        System.out.print(YELLOW + "Enter your choice: " + RESET);
    }

    public static void success(String message) {

        System.out.println(GREEN + "✔ " + message + RESET);
    }

    public static void error(String message) {

        System.out.println(RED + "✖ " + message + RESET);
    }

    public static void info(String message) {

        System.out.println(CYAN + message + RESET);
    }

}