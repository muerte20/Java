package ru.mirea.lab6.ex2;

public class DogTest {
    public static void main(String[] args) {
        Husky husky = new Husky("Лада", 3);
        Bulldog bulldog = new Bulldog("Бобик", 5);

        husky.bark();
        bulldog.bark();
    }
}

