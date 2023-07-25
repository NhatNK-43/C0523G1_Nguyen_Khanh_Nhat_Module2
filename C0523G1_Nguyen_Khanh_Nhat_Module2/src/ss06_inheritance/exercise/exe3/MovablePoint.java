package ss06_inheritance.exercise.exe3;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return this.xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {

        return this.ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    public String toString() {
        return "Point(x,y),speed = (" + super.getX() + ", " + super.getY() + ")";
    }

    public MovablePoint move() {
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return this;
    }

}
