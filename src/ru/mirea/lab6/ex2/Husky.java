package ru.mirea.lab6.ex2;

class Husky extends Dog {
    public Husky(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(name + ": Гав-гав!");
    }
}
