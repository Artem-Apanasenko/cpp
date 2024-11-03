public class Driver {
    String name;
    String licenseNumber;

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", name, licenseNumber);
    }
}
