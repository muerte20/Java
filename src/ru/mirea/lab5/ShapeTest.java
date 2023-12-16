package ru.mirea.lab5;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle("RED", false, 5.5);  // Приведение Circle к типу Shape
        // Вывод результатов методов Circle, определенных в Shape
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius());   // Метод отсутствует в Shape

        System.out.println();

        Circle c1 = (Circle)s1;                   // Обратное приведение к типу Circle
        // Вывод результатов методов Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        System.out.println();
        //Shape s2 = new Shape();   // Абстрактный класс

        Shape s3 = new Rectangle("RED", false, 1.0, 2.0);   // Приведение Rectangle к типу Shape
        // Вывод результатов методов Rectangle, определенных в Shape
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); // Метод отсутствует в Shape

        System.out.println();

        Rectangle r1 = (Rectangle)s3;   // Обратное приведение к типу Rectangle
        // Вывод результатов методов Rectangle
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        System.out.println();

        Shape s4 = new Square(6.6);     // Приведение Square к типу Shape
        // Вывод результатов методов Square, определенных в Shape
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());  // Метод отсутствует в Rectangle

        System.out.println();

        Rectangle r2 = (Rectangle)s4;
        // Вывод результатов методов Square, определенных в Rectangle
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());  // Метод отсутствует в Rectangle
        System.out.println(r2.getLength());

        System.out.println();

        // Приведение Rectangle r2 к типу Square
        Square sq1 = (Square)r2;
        // Вывод результатов методов Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }
}
