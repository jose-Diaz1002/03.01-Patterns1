package nivel3.commands;

import nivel3.models.Bicycle;
import nivel3.models.Vehiculo;

public class CommandBrake implements Command {

    Vehiculo vehiculo;

    public CommandBrake(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void execute() {
        vehiculo.brake();
    }

}
