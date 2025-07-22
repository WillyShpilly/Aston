package two.iml;
import two.models.LandTransport;


public class Taxi extends LandTransport {
    public final Wheels wheels;

    public Taxi(Wheels wheels) {
        super("Такси");
        this.wheels = wheels;
    }

    @Override
    public void move() {
        System.out.println("Такси движется по дороге 🚕.");
    }
}
