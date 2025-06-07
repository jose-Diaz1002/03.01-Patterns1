package nivel3.commands;

import nivel3.models.Bicycle;
import nivel3.models.Vehiculo;

public class CommandStars implements Command {

    Vehiculo vehiculo;

    public CommandStars(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void execute() {
        vehiculo.start();
    }

}
