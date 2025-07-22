package two.impl;

import two.interfaces.CargoTransport;
import two.models.WaterTransport;

public class Boat extends WaterTransport implements CargoTransport {
    public final Propeller propeller;
    public Boat(Propeller propeller) {
        super("Катер");
        this.propeller = propeller;
    }

    @Override
    public void move() {
        System.out.println("Катер плывет 🚤.");
    }
}
