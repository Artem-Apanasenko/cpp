import java.util.Date;

public class Maintenance {
    String carLicensePlate;
    Date date;
    String description;

    public Maintenance(String carLicensePlate, Date date, String description) {
        this.carLicensePlate = carLicensePlate;
        this.date = date;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Maintenance for %s on %s: %s",
                carLicensePlate, date, description);
    }
}
