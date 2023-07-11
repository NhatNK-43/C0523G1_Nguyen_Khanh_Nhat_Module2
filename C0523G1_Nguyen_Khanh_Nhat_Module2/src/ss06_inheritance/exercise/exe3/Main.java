package ss06_inheritance.exercise.exe3;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3,4);
        System.out.println(movablePoint);
        movablePoint.setXSpeed(3);
        movablePoint.setYSpeed(10);
        System.out.println(movablePoint);
    }
}
