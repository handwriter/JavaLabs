package ru.mirea.lab4;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Sizes size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Надел футболку");
    }

    @Override
    public void dressWomen() {
        System.out.println("Надела футболку");
    }

    @Override
    public String toString() {
        return "Футболка ( Размер: " + size + ", цена: " + price + ", цвет: " + color + " )";
    }
}
