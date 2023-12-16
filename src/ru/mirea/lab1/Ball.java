package ru.mirea.lab1;

public class Ball {
    private  int radius;
    private String color;

    public Ball(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public Ball() {
        this.radius = 1;
        this.color = "Красный";
    }


    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public int getDiametr(){
        return 2*radius;
    }
}