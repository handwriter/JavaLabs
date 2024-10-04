package ru.mirea.lab4;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Sizes size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Надела юбку");
    }

    @Override
    public String toString() {
        return "Юбка ( Размер: " + size + ", цена: " + price + ", цвет: " + color + " )";
    }
}
