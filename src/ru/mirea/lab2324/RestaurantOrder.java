package ru.mirea.lab2324;
import java.util.ArrayList;
import java.util.List;

public class RestaurantOrder implements Order {
    private List<Item> items;
    private List<Table> tables;

    public RestaurantOrder() {
        this.items = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public Table getTable(int tableNumber) {
        for (Table table : tables) {
            if (table.getTableNumber() == tableNumber) {
                return table;
            }
        }
        return null;
    }
    public List<Table> getTables() {
        return tables;
    }

    @Override
    public boolean addItem(Item item) {
        return items.add(item);
    }

    @Override
    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    @Override
    public boolean removeItemByName(String name) {
        boolean removed = false;
        List<Item> itemsToRemove = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(name)) {
                itemsToRemove.add(item);
                removed = true;
            }
        }
        items.removeAll(itemsToRemove);
        return removed;
    }

    @Override
    public int removeAllItemsByName(String name) {
        int count = 0;
        List<Item> itemsToRemove = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(name)) {
                itemsToRemove.add(item);
                count++;
            }
        }
        items.removeAll(itemsToRemove);
        return count;
    }

    @Override
    public int getTotalItems() {
        return items.size();
    }

    @Override
    public Item[] getItems() {
        return items.toArray(new Item[0]);
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public int getQuantityByName(String name) {
        int quantity = 0;
        for (Item item : items) {
            if (item.getName().equals(name)) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public String[] getDistinctItems() {
        List<String> distinctItems = new ArrayList<>();
        for (Item item : items) {
            if (!distinctItems.contains(item.getName())) {
                distinctItems.add(item.getName());
            }
        }
        return distinctItems.toArray(new String[0]);
    }

    @Override
    public Item[] getSortedItemsByPrice() {
        Item[] sortedItems = items.toArray(new Item[0]);
        for (int i = 0; i < sortedItems.length - 1; i++) {
            for (int j = 0; j < sortedItems.length - i - 1; j++) {
                if (sortedItems[j].getPrice() < sortedItems[j + 1].getPrice()) {
                    Item temp = sortedItems[j];
                    sortedItems[j] = sortedItems[j + 1];
                    sortedItems[j + 1] = temp;
                }
            }
        }
        return sortedItems;
    }
}
