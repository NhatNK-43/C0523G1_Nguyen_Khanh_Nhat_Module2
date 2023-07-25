package ss07_abstract_interface.exercise.exe2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(6.0);
        shapes[1] = new Square(5.7);
        shapes[2] = new Rectangle(5.2,6.1);
        shapes[3] = new Square(5.1);

        for (Shape shape:shapes){
            System.out.println(shape);
            if (shape instanceof Square){
//                Colorable colorable = (Square)shape;
//                colorable.howToColor();
                ((Square) shape).howToColor();
            }
        }

        System.out.println("\n\n");
        for (Shape shape:shapes){
            System.out.println(shape);
        }
    }
}
