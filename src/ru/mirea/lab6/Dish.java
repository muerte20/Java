package ru.mirea.lab6;

abstract class Dish {
    protected String material;
    protected String color;

    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public abstract void use();  // абстрактный метод использования
}

