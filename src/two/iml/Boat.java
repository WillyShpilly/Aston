package two.iml;

import two.models.WaterTransport;

public class Boat extends WaterTransport {
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
