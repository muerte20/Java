package ru.mirea.lab6;

public class DishTest {
    public static void main(String[] args) {
        Plate plate = new Plate("Керамика", "Белый");
        Cup cup = new Cup("Глина", "Прозрачный");
        Fork fork = new Fork("Металл", "Серебряный");

        System.out.println("Тарелка: Материал - " + plate.material + ", Цвет - " + plate.color);
        plate.use();

        System.out.println("Чашка: Материал - " + cup.material + ", Цвет - " + cup.color);
        cup.use();

        System.out.println("Вилка: Материал - " + fork.material + ", Цвет - " + fork.color);
        fork.use();
    }
}

