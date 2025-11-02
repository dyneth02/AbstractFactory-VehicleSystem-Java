package version_d.q3;

public class RollsRoyce implements ICar {
    private static RollsRoyce instance;

    private RollsRoyce() {}

    public static RollsRoyce getInstance() {
        if (instance == null) {
            instance = new RollsRoyce();
        }
        return instance;
    }

    @Override
    public void displayVehicle() {
        System.out.println("Factory turns out Rolls Royce car.");
    }
}
