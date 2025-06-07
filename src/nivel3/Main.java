package nivel3;

import nivel3.device.Configuration;
import nivel3.device.Control;

public class Main {
    public static void main(String[] args) {

        Control control = new Control();

        Configuration.setUp(control);

    }
}
