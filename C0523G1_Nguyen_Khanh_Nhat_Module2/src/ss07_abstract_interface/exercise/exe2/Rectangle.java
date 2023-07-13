package ss07_abstract_interface.exercise.exe1;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area="+getArea()+
                '}';
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth()*percent/100);
        setLength(getLength()*percent/100);
    }
}
