package ru.mirea.lab2324;
public class MenuItem implements Item {
    private String name;
    private double price;
    private String description;

    public MenuItem(String name, String description, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Отрицательная стоимость недопустима.");
        }
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
