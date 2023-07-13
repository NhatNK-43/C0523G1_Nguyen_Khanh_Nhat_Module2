package ss07_abstract_interface.exercise.exe1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(6.0);
        shapes[1] = new Rectangle(5.2,6.1);
        shapes[2] = new Square(5.1);

        for (Shape shape:shapes){
            System.out.println(shape);
            shape.resize(Math.round(Math.random()*100));
        }

        for (Shape shape:shapes){
            System.out.println(shape);
        }
    }
}
