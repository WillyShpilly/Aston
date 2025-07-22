import one.impl.Bear;
import one.impl.Fur;
import one.impl.Whale;


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
