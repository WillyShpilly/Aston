package models;

import interfaces.AquaticLiving;

public abstract class Fish extends Animal implements AquaticLiving {

    public Fish(String name) {
        super(name, true);
    }

    @Override
    public void liveInWater() {

    }
}
