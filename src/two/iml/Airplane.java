package two.iml;

import two.interfaces.CargoTransport;
import two.models.AirTransport;

public class Airplane extends AirTransport implements CargoTransport {
    public final Wings wings;
    public final Wheels wheels;
    public final Propeller propeller;

    public Airplane(Wings wings, Wheels wheels, Propeller propeller) {
        super("Самолет");
        this.wings = wings;
        this.wheels = wheels;
        this.propeller = propeller;
    }

    @Override
    public void move() {
        System.out.println("Самолет летит ✈️.");
    }
}