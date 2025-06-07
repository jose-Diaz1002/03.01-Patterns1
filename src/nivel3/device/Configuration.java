package nivel3.device;

import nivel3.commands.CommandAccelerate;
import nivel3.commands.CommandBrake;
import nivel3.commands.CommandStars;
import nivel3.models.*;

public class Configuration {

    public static void setUp(Control control) {

        Vehiculo car = new Car();
        Vehiculo bicycle = new Bicycle();
        Vehiculo boat = new Boat();
        Vehiculo plane = new Plane();

        control.setCommand(new CommandStars(car));
        control.presionarBoton();
        control.setCommand(new CommandAccelerate(car));
        control.presionarBoton();
        control.setCommand(new CommandBrake(car));
        control.presionarBoton();
        System.out.println("-------------------");
        control.setCommand(new CommandStars(bicycle));
        control.presionarBoton();
        control.setCommand(new CommandAccelerate(bicycle));
        control.presionarBoton();
        control.setCommand(new CommandBrake(bicycle));
        control.presionarBoton();
        System.out.println("-------------------");
        control.setCommand(new CommandStars(boat));
        control.presionarBoton();
        control.setCommand(new CommandAccelerate(boat));
        control.presionarBoton();
        control.setCommand(new CommandBrake(boat));
        control.presionarBoton();
        System.out.println("-------------------");
        control.setCommand(new CommandStars(plane));
        control.presionarBoton();
        control.setCommand(new CommandAccelerate(plane));
        control.presionarBoton();
        control.setCommand(new CommandBrake(plane));
        control.presionarBoton();

    }

}
