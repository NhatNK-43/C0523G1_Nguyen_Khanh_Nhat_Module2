package ss15_exception.exercise;

public class Triangle {
    private int a;
    private int b;
    private int c;

    @Override
    public String toString() {
        return "Tam giác có 3 cạnh: " +
                "a=" + a +
                ", b=" + b +
                ", c=" + c;
    }

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh tam giác phải lớn hơn không");
        } else if (a + b <= c || b + c <= a || a + c <= b) {
            throw new IllegalTriangleException("a, b, c không phải là 3 cạnh của 1 tam giác");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
