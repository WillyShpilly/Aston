import one.iml.Bear;
import one.iml.Fur;
import one.iml.Whale;

import two.iml.Helicopter;



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
