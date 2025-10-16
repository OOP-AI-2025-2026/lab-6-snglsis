package ua.opnu.list;

class Smartphone implements GPS, Cellular {

    private String model;
    private double latitude;
    private double longitude;

    public Smartphone(String model, double latitude, double longitude) {
        this.model = model;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Реализация метода из интерфейса GPS
    @Override
    public double[] getCoordinates() {
        return new double[]{latitude, longitude};
    }

    // Реализация методов из интерфейса Cellular
    @Override
    public void makeCall() {
        System.out.println(model + " совершаем звонок...");
    }

    @Override
    public void receiveCall() {
        System.out.println(model + " принимаем звонок...");
    }

    // Дополнительный метод для вывода информации
    public void showInfo() {
        System.out.println("Модель телефона: " + model);
        System.out.println("Текущие координаты: (" + latitude + ", " + longitude + ")");
    }
}
