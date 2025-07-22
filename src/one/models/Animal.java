package one.models;

public abstract class Animal {
    private final String name;
    private final boolean hasSpine;

    public Animal(String name, boolean hasSpine) {
        this.name = name;
        this.hasSpine = hasSpine;
    }

    public abstract void eat();
}
