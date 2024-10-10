package ru.mirea.lab6;

public class MovableRectangle implements Movable {
    public MovablePoint topLeft;
    public MovablePoint bottomRight;

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

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    public boolean checkPointSpeeds()
    {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }
}
