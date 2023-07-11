package ss05_access_modifier.exercise.exe1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);

        System.out.println("Circle 1: \n+ Radius: "+circle1.getRadius()+"\n+ Area: "+circle1.getArea());
        System.out.println("\nCircle 2: \n+ Radius: "+circle2.getRadius()+"\n+ Area: "+circle2.getArea());

    }
}
