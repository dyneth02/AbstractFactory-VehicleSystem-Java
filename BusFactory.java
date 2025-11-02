package version_d.q3;

public class BusFactory implements VehicleFactory {
    private static volatile BusFactory instance;

    private BusFactory() {}

    public static BusFactory getInstance() {
        if (instance == null) {
            synchronized (BusFactory.class) {            	
            	if (instance == null) {
            		instance = new BusFactory();
            	}
            }
        }
        return instance;
    }

    @Override
    public IVehicle getModel(String vehicle) {
        switch (vehicle) {
            case "Volvo":
                return Volvo.getInstance();
            case "Fuso":
                return Fuso.getInstance();
            case "TATA":
                return TATA.getInstance();
            default:
                throw new IllegalArgumentException("Unknown bus model: " + vehicle);
        }
    }
}
