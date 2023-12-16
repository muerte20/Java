package ru.mirea.lab6;

class Fork extends Dish {
    public Fork(String material, String color) {
        super(material, color);
    }

    @Override
    public void use() {
        System.out.println("Вилка используется для еды.");
    }
}
