package ru.mirea.lab9.ex2;

// Интерфейс Priceable с методом getPrice()
interface Priceable {
    double getPrice();
}

// Пример класса, представляющего продукт
class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Пример класса, представляющего автомобиль
class Car implements Priceable {
    private String brand;
    private double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

public class PriceableExample {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1000.0);
        Car toyota = new Car("Toyota", 25000.0);

        // Используем метод getPrice() для получения цены объекта
        System.out.println("Laptop price: $" + laptop.getPrice());
        System.out.println("Toyota price: $" + toyota.getPrice());
    }
}
