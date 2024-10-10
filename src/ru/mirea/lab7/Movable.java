package ru.mirea.lab7;

public interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();

    public static String int2Str(int arg)
    {
        return Integer.toString(arg);
    }
}
