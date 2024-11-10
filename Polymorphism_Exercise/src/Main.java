import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
        Vehicle car1 = new Car("toyota ", 5);

        int userInput;
        do {
            System.out.println("***Vehicle Rental System***"
                    + "\nPlease, Select an option from the following menu "
                    + "\n1. Rent a Car " + "\n2. Rent a Bike " + "\n3. Rent a Truck "
                    + "\n4. View Rented vehicles " + "\n5.Exit\n");
            userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Please Enter a car model: ");
                    input.nextLine();
                    String carModel = input.nextLine();
                    System.out.println("And Enter number of days you want to rent it: ");
                    int carRental_NumberOfDays = input.nextInt();
                    rentedVehicles.add(new Car(carModel, carRental_NumberOfDays));
                    break;
                case 2:
                    System.out.println("Please Enter a bike brand: ");
                    input.nextLine();
                    String bikeBrand = input.nextLine();
                    System.out.println("And Enter number of hours you ant to rent it: ");
                    int bikeRental_NumberOfHours = input.nextInt();
                    rentedVehicles.add(new Bike(bikeBrand, bikeRental_NumberOfHours));
                    break;
                case 3:
                    System.out.println("Please Enter a truck type: ");
                    input.nextLine();
                    String truckType = input.nextLine();
                    System.out.println("And Enter number of weeks you want to rent it: ");
                    int truckRental_NumberOfWeeks = input.nextInt();
                    rentedVehicles.add(new Truck(truckType, truckRental_NumberOfWeeks));
                    break;
                case 4:
                    for (Vehicle vehicle : rentedVehicles) {
                        vehicle.displayDetails();
                        System.out.println("************************");
                    }
                    break;
            }

        } while (userInput != 5);

    }
}