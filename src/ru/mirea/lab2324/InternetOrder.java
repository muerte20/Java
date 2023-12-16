package ru.mirea.lab2324;
public class InternetOrder implements Order {

    @Override
    public boolean addItem(Item item) {
        ListNode newNode = new ListNode(item);
        newNode.next = head;
        newNode.previous = head.previous;
        head.previous.next = newNode;
        head.previous = newNode;
        size++;
        return true;
    }

    @Override
    public boolean removeItem(Item item) {
        ListNode node = head.previous;
        while (node != head) {
            if (node.item.getName().equals(item.getName())) {
                node.previous.next = node.next;
                node.next.previous = node.previous;
                size--;
                return true;
            }
            node = node.previous;
        }
        return false;
    }

    @Override
    public boolean removeItemByName(String name) {
        ListNode node = head.previous;
        while (node != head) {
            if (node.item.getName().equals(name)) {
                node.previous.next = node.next;
                node.next.previous = node.previous;
                size--;
                return true;
            }
            node = node.previous;
        }
        return false;
    }

    @Override
    public int removeAllItemsByName(String name) {
        int count = 0;
        ListNode node = head.previous;
        while (node != head) {
            if (node.item.getName().equals(name)) {
                node.previous.next = node.next;
                node.next.previous = node.previous;
                count++;
                size--;
            }
            node = node.previous;
        }
        return count;
    }

    @Override
    public int getTotalItems() {
        return size;
    }

    @Override
    public Item[] getItems() {
        Item[] positions = new Item[size];
        ListNode node = head.next;
        int index = 0;
        while (node != head) {
            positions[index++] = node.item;
            node = node.next;
        }
        return positions;
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0.0;
        ListNode node = head.next;
        while (node != head) {
            totalPrice += node.item.getPrice();
            node = node.next;
        }
        return totalPrice;
    }

    @Override
    public int getQuantityByName(String name) {
        int quantity = 0;
        ListNode node = head.next;
        while (node != head) {
            if (node.item.getName().equals(name)) {
                quantity++;
            }
            node = node.next;
        }
        return quantity;
    }

    @Override
    public String[] getDistinctItems() {
        ListNode node = head.next;
        int distinctCount = 0;
        while (node != head) {
            int count = 0;
            ListNode temp = head.next;
            while (temp != node) {
                if (temp.item.getName().equals(node.item.getName())) {
                    count++;
                    break;
                }
                temp = temp.next;
            }
            if (count == 0) {
                distinctCount++;
            }
            node = node.next;
        }

        String[] distinctItems = new String[distinctCount];
        node = head.next;
        int index = 0;
        while (node != head) {
            int count = 0;
            ListNode temp = head.next;
            while (temp != node) {
                if (temp.item.getName().equals(node.item.getName())) {
                    count++;
                    break;
                }
                temp = temp.next;
            }
            if (count == 0) {
                distinctItems[index++] = node.item.getName();
            }
            node = node.next;
        }

        return distinctItems;
    }

    @Override
    public Item[] getSortedItemsByPrice() {
        Item[] sortedItems = getItems();
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

    private class ListNode {
        private Item item;
        private ListNode next;
        private ListNode previous;

        public ListNode(Item item) {
            this.item = item;
            this.next = null;
            this.previous = null;
        }
    }

    private ListNode head;
    private int size;

    public InternetOrder() {
        this.head = new ListNode(null);
        this.head.next = this.head;
        this.head.previous = this.head;
        this.size = 0;
    }

    public InternetOrder(Item[] items) {
        this();
        for (Item item : items)
            addItem(item);
    }
}