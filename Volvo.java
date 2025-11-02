package version_d.q3;

public class Volvo implements IBus {
    private static Volvo instance;

    private Volvo() {}

    public static Volvo getInstance() {
        if (instance == null) {
            instance = new Volvo();
        }
        return instance;
    }

    @Override
    public void displayVehicle() {
        System.out.println("Factory turns out Volvo bus.");
    }
}
