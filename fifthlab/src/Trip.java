import java.util.Date;

public class Trip {
    String carLicensePlate;
    String driverName;
    Date date;
    String destination;

    public Trip(String carLicensePlate, String driverName, Date date, String destination) {
        this.carLicensePlate = carLicensePlate;
        this.driverName = driverName;
        this.date = date;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return String.format("Trip with %s by %s on %s to %s",
                carLicensePlate, driverName, date, destination);
    }
}
