package ss04_oop.exercise;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {

        return a;
    }

    public void setA(double a) {

        this.a = a;
    }

    public double getB() {

        return b;
    }

    public void setB(double b) {

        this.b = b;
    }

    public double getC() {

        return c;
    }

    public void setC(double c) {

        this.c = c;
    }

    public double getDiscriminant() {
        return getB() * getB() - 4 * getA() * getC();
    }

    public double getRoot1() {

        return (-getB() + Math.sqrt(getDiscriminant())) / (2 * getA());
    }

    public double getRoot2() {

        return (-getB() - Math.sqrt(getDiscriminant())) / (2 * getA());
    }

    public void display() {
        if (getDiscriminant() > 0) {
            System.out.printf("Phuong trinh co");
        }
    }
}
