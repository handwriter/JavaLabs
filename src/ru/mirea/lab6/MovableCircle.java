package ru.mirea.lab6;

public class MovableCircle implements Movable{
    public int radius;
    public MovablePoint center;

    @Override
    public void moveUp() {
        System.out.println("Вверх");
    }

    @Override
    public void moveDown() {
        System.out.println("Вниз");
    }

    @Override
    public void moveLeft() {
        System.out.println("Влево");
    }

    @Override
    public void moveRight() {
        System.out.println("Вправо");
    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
