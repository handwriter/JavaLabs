package ru.mirea.lab7;

public class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

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

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint ( X: "+x+", Y: "+y+", xSpeed: "+xSpeed+", ySpeed: "+ySpeed+")";
    }
}
