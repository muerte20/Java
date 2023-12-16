package ru.mirea.lab2324;
public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException() {
        super("Заказ уже добавлен в таблицу");
    }
}