package ss06_inheritance.exercise.exe3;

public class Point {
    private float x,y;

    public Point(){
        this(0.0f,0.0f);
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        return new float[]{x,y};
    }

    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }

    public String toString(){
        return "Point(x,y) = ("+getXY()[0]+", "+getXY()[1]+")";
    }


}

