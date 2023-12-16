package ru.mirea.lab1;

public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("1984", 74);
        Book d2 = new Book("Мы", 99);
        Book d3 = new Book("Заводной апельсин");
        d3.setAge(61);
        System.out.println(d1);
        System.out.println(d1.setName());
        System.out.println(d2.setName());
        System.out.println(d3.setName());

    }
}