package ru.mirea.lab4_1;

public class Square extends Shape {
    private float x;
    private float y;
    private float a;

    @Override
    String getType() {
        return "Квадрат";
    }

    @Override
    double getArea() {
        return a * a;
    }

    @Override
    double getPerimeter() {
        return 4 * a;
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

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return getType() + " ( X: " + x + ", Y: " + y + ", A: " + a + " )";
    }

    public Square(float x, float y, float a)
    {
        this.x = x;
        this.y = y;
        this.a = a;
    }
}
