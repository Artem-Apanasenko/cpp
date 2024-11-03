public class Car {
    String brand;
    String model;
    int year;
    String licensePlate;

    public Car(String brand, String model, int year, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%d) - %s", brand, model, year, licensePlate);
    }
}
