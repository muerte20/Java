package ru.mirea.lab6;

class Plate extends Dish {
    public Plate(String material, String color) {
        super(material, color);
    }

    @Override
    public void use() {
        System.out.println("Тарелка используется для еды.");
    }
}

