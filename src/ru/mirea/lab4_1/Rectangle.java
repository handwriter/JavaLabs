package ru.mirea.lab4_1;

public class Rectangle extends Shape {
    private float x;
    private float y;
    private float width;
    private float height;

    @Override
    String getType() {
        return "Прямоугольник";
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return (2 * width) + (2 * height);
    }

    @Override
    public String toString() {
        return getType() + " ( X: " + x + ", Y: " + y + ", Width: " + width + ", Height: " + height + " )";
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

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Rectangle(float x, float y, float width, float height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
