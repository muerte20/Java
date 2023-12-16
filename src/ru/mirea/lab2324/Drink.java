package ru.mirea.lab2324;
public class Drink implements Item {
    private String name;
    private double price;
    private String description;

    public Drink(String name, String description, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Отрицательная стоимость недопустима.");
        }
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}
