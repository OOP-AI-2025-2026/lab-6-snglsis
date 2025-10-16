package ua.opnu.list;

public class MainForSmartphone {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung Galaxy S24", 50.4501, 30.5234);

        phone.showInfo();
        phone.makeCall();
        phone.receiveCall();

        double[] coords = phone.getCoordinates();
        System.out.println("Координаты по GPS: " + coords[0] + ", " + coords[1]);
    }
}
