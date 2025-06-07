package nivel3.models;

public class Bicycle extends Vehiculo {

    @Override
    public void start() {
        System.out.println("Bicycle ready to pedal.");
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle pedaling faster.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle braking.");
    }

}
