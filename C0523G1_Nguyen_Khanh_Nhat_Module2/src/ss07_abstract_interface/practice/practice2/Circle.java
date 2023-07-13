package ss06_inheritance.exercise.exe1;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this(1.0, "blue");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "A circle with radius  = " + getRadius() + ", area = " + getArea();
    }
}
