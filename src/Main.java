import iml.Bear;
import iml.Fur;
import iml.Whale;

public class Main {
    public static void main(String[] args) {
        Fur fur = new Fur("brown", 15);
        Bear bear = new Bear("Олимпийский", fur);
        bear.eat();
        Whale whale = new Whale("Ландыш");
        whale.eat();
        whale.liveInWater();
    }
}
