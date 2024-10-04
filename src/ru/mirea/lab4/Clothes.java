package ru.mirea.lab4;

public abstract class Clothes {
    public Sizes size;
    public float price;
    public String color;

    public Clothes(Sizes size, float price, String color)
    {
        this.size = size;
        this.price = price;
        this.color = color;
    }
}
