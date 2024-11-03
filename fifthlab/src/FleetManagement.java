import java.util.*;

public class FleetManagement {
    private Map<String, Car> cars = new HashMap<>();
    private List<Trip> tripLog = new ArrayList<>();
    private Map<String, List<Maintenance>> maintenanceRecords = new HashMap<>();
    private Set<String> drivers = new HashSet<>();


    public void addCar(Car car) {
        cars.put(car.licensePlate, car);
    }

    public Car getCar(String licensePlate) {
        return cars.get(licensePlate);
    }

    public void updateCar(String licensePlate, Car newCar) {
        cars.put(licensePlate, newCar);
    }

    public void removeCar(String licensePlate) {
        cars.remove(licensePlate);
    }

    // CRUD operations for Trips
    public void addTrip(Trip trip) {
        tripLog.add(trip);
    }

    // CRUD operations for Maintenance
    public void addMaintenance(String carLicensePlate, Maintenance maintenance) {
        maintenanceRecords.putIfAbsent(carLicensePlate, new ArrayList<>());
        maintenanceRecords.get(carLicensePlate).add(maintenance);
    }

    public void showStatistics() {
        System.out.println("Car Statistics:");
        for (Map.Entry<String, List<Maintenance>> entry : maintenanceRecords.entrySet()) {
            System.out.println("Car: " + entry.getKey() + " - Maintenance Records: " + entry.getValue().size());
        }
    }

    public void showCars() {
        for (Car car : cars.values()) {
            System.out.println(car);
        }
    }

    public void showTrips() {
        for (Trip trip : tripLog) {
            System.out.println(trip);
        }
    }

    public void showDrivers() {
        for (String driver : drivers) {
            System.out.println(driver);
        }
    }

    public void registerDriver(String driverName) {
        drivers.add(driverName);
    }
}
