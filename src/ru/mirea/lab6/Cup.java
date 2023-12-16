package ru.mirea.lab6;

class Cup extends Dish {
    public Cup(String material, String color) {
        super(material, color);
    }

    @Override
    public void use() {
        System.out.println("Чашка используется для питья.");
    }
}

