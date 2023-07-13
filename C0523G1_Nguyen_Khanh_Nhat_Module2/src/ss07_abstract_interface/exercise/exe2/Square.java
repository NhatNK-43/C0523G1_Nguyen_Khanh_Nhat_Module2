package ss07_abstract_interface.exercise.exe1;

public class Square extends Shape{
    private double side;
    public Square() {
    }

    public Square(double side) {
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area="+getArea()+
                '}';
    }

    public void resize(double percent) {
        setSide(getSide() * percent / 100);
    }
}
