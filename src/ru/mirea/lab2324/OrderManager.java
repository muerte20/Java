package ru.mirea.lab2324;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    private Map<String, Order> addressToOrder;

    public OrderManager() {
        this.addressToOrder = new HashMap<>();
    }

    public void addOrder(String address, Order order) {
        addressToOrder.put(address, order);
    }

    public Order getOrder(String address) {
        return addressToOrder.get(address);
    }

    public void removeOrder(String address) {
        addressToOrder.remove(address);
    }

    public void addPositionToOrder(String address, Item item) throws OrderAlreadyAddedException {
        Order order = addressToOrder.get(address);
        if (order != null) {
            order.addItem(item);
        }
    }

    public Order[] getInternetOrders() {
        return addressToOrder.values().toArray(new Order[0]);
    }

    public double getTotalPriceOfInternetOrders() {
        double totalPrice = 0.0;
        for (Order order : addressToOrder.values()) {
            totalPrice += order.getTotalPrice();
        }
        return totalPrice;
    }

    public int getTotalQuantityOfItem(String itemName) {
        int totalQuantity = 0;
        for (Order order : addressToOrder.values()) {
            totalQuantity += order.getQuantityByName(itemName);
        }
        return totalQuantity;
    }
}