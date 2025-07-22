package two.impl;

import two.interfaces.CargoTransport;
import two.models.WaterTransport;

public class Tanker extends WaterTransport implements CargoTransport {
    public final Propeller propeller;

    public Tanker(Propeller propeller) {
        super("Танкер");
        this.propeller = propeller;
    }

    @Override
    public void move() {
        System.out.println("Танкер плывет 🚢.");
    }
}