package ru.mirea.lab6.ex2;

abstract class Dog {
    protected String name;
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void bark();  // абстрактный метод лая
}

