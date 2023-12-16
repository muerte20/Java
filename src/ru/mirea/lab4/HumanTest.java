package ru.mirea.lab4;

class Head {
    private String hairColor;

    public Head(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Head { hairColor: '" + hairColor + "' }";
    }
}

class Leg {
    private double length;

    public Leg(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Leg { length: " + length + " }";
    }
}

class Hand {
    private double length;

    public Hand(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hand { length: " + length + " }";
    }
}

class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(String hairColor, double legLength, double handLength) {
        this.head = new Head(hairColor);
        this.leftLeg = new Leg(legLength);
        this.rightLeg = new Leg(legLength);
        this.leftHand = new Hand(handLength);
        this.rightHand = new Hand(handLength);
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    @Override
    public String toString() {
        return "Human {\n" +
                "  head: " + head + ",\n" +
                "  leftLeg: " + leftLeg + ",\n" +
                "  rightLeg: " + rightLeg + ",\n" +
                "  leftHand: " + leftHand + ",\n" +
                "  rightHand: " + rightHand + "\n" +
                '}';
    }
}

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("Black", 1.0, 0.75);
        System.out.println(human);

        // Пример изменения свойств
        human.getHead().setHairColor("Blonde");
        human.getLeftLeg().setLength(1.1);
        System.out.println("After modifying properties:");
        System.out.println(human);
    }
}
