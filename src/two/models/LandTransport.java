package two.models;

import two.interfaces.Transport;

public abstract class LandTransport implements Transport {
    protected final String type;

    public LandTransport(String type) {
        this.type = type;
    }


    @Override
    public void displayProperties() {
        System.out.println("Тип транспорта: " + type);
        System.out.println("Имеет колёса.");
    }
}

