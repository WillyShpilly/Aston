package two.iml;

import two.interfaces.CargoTransport;
import two.models.AirTransport;


public class Helicopter extends AirTransport implements CargoTransport {
    public final Propeller propeller;

    public Helicopter(Propeller propeller) {
        super("Вертолет");
        this.propeller = propeller;
    }

    @Override
    public void move() {
        System.out.println("Вертолет летит 🚁.");
    }
}
