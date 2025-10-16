package ua.opnu.list;

class Car implements Comparable {

    private int price;        // цена
    private int year;         // год выпуска
    private int horsePower;   // количество лошадиных сил

    // Конструктор с тремя аргументами
    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    // Геттеры
    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    // Сеттеры
    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    // Реализация метода compareTo из интерфейса Comparable
    @Override
    public int compareTo(Object o) {
        Car other = (Car) o;

        // 1. Сначала сравниваем по цене — "больше" тот автомобиль, у которого МЕНЬШЕ цена
        if (this.price != other.price) {
            return other.price - this.price;
        }

        // 2. Если цены равны — "больше" тот, который НОВЕЕ
        if (this.year != other.year) {
            return this.year - other.year;
        }

        // 3. Если год одинаковый — "больше" тот, у которого БОЛЬШЕ лошадиных сил
        return this.horsePower - other.horsePower;
    }

    @Override
    public String toString() {
        return String.format("Автомобиль: цена=%d$, год=%d, мощность=%d л.с.",
                price, year, horsePower);
    }
}