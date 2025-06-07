package nivel3.models;

public class Car extends Vehiculo {
    @Override
    public void start() {
        System.out.println("Star Car.");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate Car.");
    }

    @Override
    public void brake() {
        System.out.println("Brake Car.");
    }

}
