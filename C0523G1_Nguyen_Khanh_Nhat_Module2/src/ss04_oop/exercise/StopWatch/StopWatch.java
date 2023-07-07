package ss04_oop.exercise.StopWatch;

public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public double getStarTime() {
        return startTime;
    }

    public void setStarTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public void start() {
        setStarTime(System.currentTimeMillis());
    }

    public void stop() {
        setEndTime(System.currentTimeMillis());
    }

    public double getElapsedTime() {
        return getEndTime() - getStarTime();
    }
}
