package ru.mirea.lab1;


public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Leha", 2);
        Dog d2 = new Dog("Jora", 7);
        Dog d3 = new Dog("Bobik");
        d3.setAge(1);
        System.out.println(d1);
        System.out.println(d1.intoHumanAge());
        System.out.println(d2.intoHumanAge());
        System.out.println(d3.intoHumanAge());

    }
}