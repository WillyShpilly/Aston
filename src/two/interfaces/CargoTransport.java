package two.interfaces;

public interface CargoTransport {
    default void transportCargo() {
        System.out.println("Здесь могла бы быть ваша реклама!");
    }
}
