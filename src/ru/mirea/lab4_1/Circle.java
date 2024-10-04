package ru.mirea.lab4_1;

public class Circle extends Shape {
    private float x;
    private float y;
    private float r;
    @Override
    String getType() {
        return "Круг";
    }

    @Override
    double getArea() {
        return Math.PI * r * r;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return getType() + " ( X: " + x + ", Y: " + y + ", R: " + r + " )";
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

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public Circle(float x, float y, float r)
    {
        this.x = x;
        this.y = y;
        this.r = r;
    }
}
