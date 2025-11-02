package version_d.q3;

public class VehicleProducer {
    private static final String CAR = "Car";
    private static final String BUS = "Bus";

    public static VehicleFactory getVehicle(String type) {
        switch (type) {
            case CAR:
                return CarFactory.getInstance();
            case BUS:
                return BusFactory.getInstance();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}
