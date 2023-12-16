package ru.mirea.lab8.l1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected Point position;

    public Shape(Color color, Point position) {
        this.color = color;
        this.position = position;
    }

    abstract void draw(Graphics g);
}

class Circle extends Shape {
    private int radius;

    public Circle(Color color, Point position, int radius) {
        super(color, position);
        this.radius = radius;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(position.x, position.y, radius * 2, radius * 2);
    }
}

class Rectangle extends Shape {
    private int width, height;

    public Rectangle(Color color, Point position, int width, int height) {
        super(color, position);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(position.x, position.y, width, height);
    }
}

public class RandomShapesDrawing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Random random = new Random();

                for (int i = 0; i < 20; i++) {
                    int x = random.nextInt(700);
                    int y = random.nextInt(500);
                    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

                    Shape shape;
                    if (random.nextBoolean()) {
                        int radius = random.nextInt(50) + 10;
                        shape = new Circle(color, new Point(x, y), radius);
                    } else {
                        int width = random.nextInt(100) + 20;
                        int height = random.nextInt(100) + 20;
                        shape = new Rectangle(color, new Point(x, y), width, height);
                    }

                    shape.draw(g);
                }
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
