package two.models;

import two.interfaces.Transport;

public abstract class WaterTransport implements Transport {
    protected final String type;

    public WaterTransport(String type) {
        this.type = type;
    }

    @Override
    public void displayProperties() {
        System.out.println("Тип транспорта: " + type);
        System.out.println("Передвигается по воде.");
    }
}
