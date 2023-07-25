package ss07_abstract_interface.exercise.exe2;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        this(1.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area="+getArea()+
                '}';
    }
}
