package nivel3.commands;

import nivel3.models.Bicycle;
import nivel3.models.Vehiculo;

public class CommandAccelerate implements Command {

    Vehiculo vehiculo;

    public CommandAccelerate(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void execute() {
        vehiculo.accelerate();
    }

}
