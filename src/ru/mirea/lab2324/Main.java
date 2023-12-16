package ru.mirea.lab2324;

public class Main {
    public static void main(String[] args) {
        MenuItem pizza = new MenuItem("Пицца", "Вкусная пицца с сыром", 20.0);
        MenuItem burger = new MenuItem("Бургер", "Сочный бургер с мясом", 15.0);
        Drink cola = new Drink("Кола", "Газированный напиток", 5.0);
        Drink lipton = new Drink("Липтон", "Очень вкусный напиток", 10.0);

        RestaurantOrder restaurantOrder = new RestaurantOrder();

        Table table1 = new Table(1, new RestaurantOrder());
        Table table2 = new Table(2, new RestaurantOrder());

        restaurantOrder.addTable(table1);
        restaurantOrder.addTable(table2);

        try {
            restaurantOrder.getTable(1).getOrder().addItem(pizza);
            restaurantOrder.getTable(1).getOrder().addItem(cola);
            restaurantOrder.getTable(1).getOrder().addItem(lipton);

            restaurantOrder.getTable(2).getOrder().addItem(burger);
        } catch (OrderAlreadyAddedException e) {
            e.printStackTrace();
        }

        double totalOrdersPrice = 0.0;

        for (Table table : restaurantOrder.getTables()) {
            System.out.println("Стол " + table.getTableNumber() + ":");
            Order order = table.getOrder();
            Item[] items = order.getItems();
            System.out.println("Заказ:");
            for (Item item : items) {
                System.out.println(item.getName() + ": " + item.getPrice());
                totalOrdersPrice += item.getPrice();
            }
            System.out.println("Общая стоимость заказа: " + order.getTotalPrice());
            System.out.println();
        }

        System.out.println("Общая стоимость всех заказов: " + totalOrdersPrice);
    }
}
