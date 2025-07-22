package two.iml;
import two.interfaces.CargoTransport;
import two.models.LandTransport;


public class Truck extends LandTransport implements CargoTransport {
    public final Wheels wheels;

    public Truck(Wheels wheels) {
        super("Грузовик");
        this.wheels = wheels;
    }

    @Override
    public void move() {
        System.out.println("Грузовик движется по дороге 🚚.");
    }
}