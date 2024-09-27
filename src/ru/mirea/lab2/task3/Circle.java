package ru.mirea.lab2.task3;

public class Circle {
    private Point centerPoint;
    private float r;

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public Circle (float r, Point centerPoint)
    {
        this.r = r;
        this.centerPoint = centerPoint;
    }

    public Circle (float r, float xCenter, float yCenter)
    {
        this.r = r;
        this.centerPoint = new Point(xCenter, yCenter);
    }
}
