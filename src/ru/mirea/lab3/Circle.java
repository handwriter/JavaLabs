package ru.mirea.lab3;

public class Circle {
    private Point centerPoint;
    private double r;

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(Point centerPoint, double r)
    {
        this.centerPoint = centerPoint;
        this.r = r;
    }

    public Circle(double x, double y, double r)
    {
        this.centerPoint = new Point(x, y);
        this.r = r;
    }

    public double GetSquare()
    {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "Circle(X: " + centerPoint.getX() + " Y: " + centerPoint.getY() + " R: " + r + " Square: " + GetSquare() + ")";
    }
}
