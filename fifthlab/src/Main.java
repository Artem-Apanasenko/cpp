import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FleetManagement fleet = new FleetManagement();

        while (true) {
            System.out.println("Choose an action: 1) Add Car 2) Show Cars 3) Add Trip 4) Show Trips 5) Add Maintenance 6) Show Statistics 7) Register Driver 8) Show Drivers 0) Exit");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    System.out.println("Enter brand:");
                    String brand = scanner.nextLine();
                    System.out.println("Enter model:");
                    String model = scanner.nextLine();
                    System.out.println("Enter year:");
                    int year = scanner.nextInt();
                    System.out.println("Enter license plate:");
                    String licensePlate = scanner.next();
                    fleet.addCar(new Car(brand, model, year, licensePlate));
                    break;

                case 2:
                    fleet.showCars();
                    break;

                case 3:
                    System.out.println("Enter car license plate:");
                    String carLicensePlate = scanner.nextLine();
                    System.out.println("Enter driver name:");
                    String driverName = scanner.nextLine();
                    System.out.println("Enter destination:");
                    String destination = scanner.nextLine();
                    fleet.addTrip(new Trip(carLicensePlate, driverName, new Date(), destination));
                    break;

                case 4:
                    fleet.showTrips();
                    break;

                case 5:
                    System.out.println("Enter car license plate for maintenance:");
                    String maintenanceLicensePlate = scanner.nextLine();
                    System.out.println("Enter maintenance description:");
                    String description = scanner.nextLine();
                    fleet.addMaintenance(maintenanceLicensePlate, new Maintenance(maintenanceLicensePlate, new Date(), description));
                    break;

                case 6:
                    fleet.showStatistics();
                    break;

                case 7:
                    System.out.println("Enter driver name:");
                    String driver = scanner.nextLine();
                    fleet.registerDriver(driver);
                    break;

                case 8:
                    fleet.showDrivers();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid action. Please try again.");
            }
        }
    }
}