package ss04_oop.exercise.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String toStr() {
        String str = "";
        if (isOn()) {
            str = "Speed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius() +
                    "\nfan is on\n";
        } else {
            str = "Color: " + getColor() + "\nRadius: " + getRadius() +
                    "\nfan is off\n";
        }
        return str;
    }
}
