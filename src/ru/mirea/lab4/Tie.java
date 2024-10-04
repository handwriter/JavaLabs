package ru.mirea.lab4;

public class Tie extends Clothes implements MenClothing {
    public Tie(Sizes size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Надел галстук");
    }

    @Override
    public String toString() {
        return "Галстук ( Размер: " + size + ", цена: " + price + ", цвет: " + color + " )";
    }
}
