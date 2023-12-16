package ru.mirea.lab3;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball();
        System.out.println(b);
        b.setXY(2.5, 4.3);
        System.out.println(b);
        b.move(10, -2);
        System.out.println(b);
    }
}
