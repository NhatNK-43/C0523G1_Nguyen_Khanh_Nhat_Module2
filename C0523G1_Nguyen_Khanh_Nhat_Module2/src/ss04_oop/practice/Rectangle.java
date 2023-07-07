package ss04_oop.practice;

public class Rectangle {
    double width, height;

    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return height;
    }

    public void setLength(double height) {
        this.height = height;
    }

    public double getArea(){
        return getWidth()*getLength();
    }

    public double getPerimeter(){
        return 2*(getWidth()+getLength());
    }

    public void display(){
        System.out.printf("The rectangle created has width: %.2f (m) height: %.2f(m)",getWidth(),getLength());
        System.out.printf("\nThe rectangle area: %.3f",getArea());
        System.out.printf("\nThe rectangle perimeter: %.3f",getPerimeter());
    }

    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle(26.3,53.4);
        rectangle.display();
    }
}

