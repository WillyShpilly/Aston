package iml;

import models.Mammal;

public class Bear extends Mammal {
    private final Fur fur;

    public Bear(String name, Fur fur) {
        super(name);
        this.fur = fur;
    }

    @Override
    public void eat() {
        System.out.println("Мишка трапезничает 🐻");
    }
}
