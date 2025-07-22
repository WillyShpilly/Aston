//package two.iml;
//
//import two.interfaces.Transport;
//
//public class WaterTransportFactory {
//    public static Transport createTransport(String type) {
//        switch (type) {
//            case "Танкер":
//                return new Tanker();
//            case "Катер":
//                return new Boat();
//            default:
//                throw new IllegalArgumentException("Неизвестный тип водного транспорта: " + type);
//        }
//    }
//}
