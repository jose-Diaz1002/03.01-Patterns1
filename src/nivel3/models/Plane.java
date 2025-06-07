package nivel3.models;

public class Plane extends Vehiculo {
    @Override
    public void start() {
        System.out.println("Plane starting engines.");
    }

    @Override
    public void accelerate() {
        System.out.println("Plane taking off.");
    }

    @Override
    public void brake() {
        System.out.println("Plane landing.");
    }

}
