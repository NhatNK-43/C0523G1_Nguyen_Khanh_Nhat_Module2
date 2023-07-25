package ss06_inheritance.exercise.exe3;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(4,2,3,5);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
        movablePoint.setSpeed(7,9);
        System.out.println(movablePoint.move());
    }
}
