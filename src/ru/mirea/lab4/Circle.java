package ru.mirea.lab4;

public class Circle {
    private double radius;
    private double x; // x координата центра
    private double y; // y координата центра

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    // Геттеры и сеттеры для свойств
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Метод для вычисления площади окружности
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Метод для вычисления периметра окружности (длины окружности)
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5, 0, 0); // Создание объекта Circle с радиусом 5 и центром в (0,0)

        System.out.println("Radius: " + circle.getRadius()); // Вывод радиуса
        System.out.println("X: " + circle.getX()); // Вывод x координаты центра
        System.out.println("Y: " + circle.getY()); // Вывод y координаты центра
        System.out.println("Area: " + circle.calculateArea()); // Вывод площади
        System.out.println("Perimeter: " + circle.calculatePerimeter()); // Вывод периметра

        // Изменение свойств объекта circle
        circle.setRadius(10);
        circle.setX(1);
        circle.setY(1);

        System.out.println("Updated Circle:"); // Вывод обновленных свойств
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("X: " + circle.getX());
        System.out.println("Y: " + circle.getY());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}
