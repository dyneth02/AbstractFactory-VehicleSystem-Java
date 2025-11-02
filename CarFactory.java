package version_d.q3;

public class CarFactory implements VehicleFactory{
	private static volatile CarFactory instance;
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if (instance == null) {
			synchronized (CarFactory.class) {
				if (instance == null) {
					instance = new CarFactory();
				}
			}
		}
		return instance;
	}

	@Override
	public IVehicle getModel(String vehicle) {
		switch (vehicle) {
	        case "Rolls Royce":
	            return RollsRoyce.getInstance();
	        case "Benz":
	            return Benz.getInstance();
	        case "BMW":
	            return BMW.getInstance();
	        default:
	            throw new IllegalArgumentException("Unknown car model: " + vehicle);
	    }
	}
}
