package ru.mirea.lab9;

// Интерфейс Nameable с методом getName()
interface Nameable {
    String getName();
}

// Пример класса, представляющего планету
class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

// Пример класса, представляющего машину
class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

// Пример класса, представляющего животное
class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class NameableExample {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth");
        Car bmw = new Car("BMW");
        Animal cat = new Animal("Cat");

        // Используем метод getName() для получения имени объекта
        System.out.println("Planet name: " + earth.getName());
        System.out.println("Car name: " + bmw.getName());
        System.out.println("Animal name: " + cat.getName());
    }
}
