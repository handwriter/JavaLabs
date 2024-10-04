package ru.mirea.lab4;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Sizes size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Надела штаны");
    }

    @Override
    public void dressMan() {
        System.out.println("Надел штаны");
    }

    @Override
    public String toString() {
        return "Штаны ( Размер: " + size + ", цена: " + price + ", цвет: " + color + " )";
    }
}
