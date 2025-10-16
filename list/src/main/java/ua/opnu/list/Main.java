package ua.opnu.list;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Биба");
        Cat cat = new Cat("Боба");

        System.out.println(dog.getName() + " говорит: " + dog.makeSound());
        System.out.println(cat.getName() + " говорит: " + cat.makeSound());
    }
}