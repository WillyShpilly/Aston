package iml;

import models.Mammal;

public class Cat extends Mammal {
    private final Fur fur;

    public Cat(String name, Fur fur) {
        super(name);
        this.fur = fur;
    }

    @Override
    public void eat() {
        System.out.println("🐈‍⬛🐈");
    }
}

