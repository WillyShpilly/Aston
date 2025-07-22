package two.models;

import two.interfaces.Transport;

public abstract class AirTransport implements Transport {
    protected final String type;

    public AirTransport(String type) {
        this.type = type;
    }

    @Override
    public void displayProperties() {
        System.out.println("Тип транспорта: " + type);
        System.out.println("Летает в воздухе.");
    }
}
