package nivel3.models;

public class Boat extends Vehiculo {
    @Override
    public void start() {
        System.out.println("Boat starting engine.");
    }

    @Override
    public void accelerate() {
        System.out.println("Boat accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Boat slowing down.");
    }

}
