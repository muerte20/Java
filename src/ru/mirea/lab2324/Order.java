package ru.mirea.lab2324;
public interface Order {
    boolean addItem(Item item) throws OrderAlreadyAddedException;
    boolean removeItem(Item item);
    boolean removeItemByName(String name);
    int removeAllItemsByName(String name);
    int getTotalItems();
    Item[] getItems();
    double getTotalPrice();
    int getQuantityByName(String name);
    String[] getDistinctItems();
    Item[] getSortedItemsByPrice();
}