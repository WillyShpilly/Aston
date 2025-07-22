//package two.iml;
//
//import two.interfaces.Transport;
//
//public class LandTransportFactory {
//    public static Transport createTransport(String type) {
//        switch (type) {
//            case "Грузовик":
//                return new Truck();
//            case "Такси":
//                return new Taxi();
//            default:
//                throw new IllegalArgumentException("Неизвестный тип наземного транспорта: " + type);
//        }
//    }
//}
