package iml;

import interfaces.AquaticLiving;
import models.Mammal;

public class Whale extends Mammal implements AquaticLiving {
    public Whale(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("🐳");
    }

    @Override
    public void liveInWater() {
        System.out.print("🌊🌊🌊🌊🌊🌊🌊🌊🌊");
    }
}
