package ss06_inheritance.exercise.exe1;

import ss06_inheritance.practice.Main;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this(1.0);
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * getRadius() + 2 * super.getArea();
    }

    public String toString() {
        return "A cylinder with radius = " + getRadius() + ", height = " + getHeight() +
                ", area = " + getArea();
    }
}
