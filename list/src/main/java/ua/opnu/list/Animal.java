package ua.opnu.list;

abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Абстрактный метод, который нужно реализовать в подклассах
    abstract String makeSound();
}