package ru.mirea.lab2324;

public class Table {
    private int tableNumber;
    private Order order;

    public Table(int tableNumber, Order order) {
        this.tableNumber = tableNumber;
        this.order = order;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}