package ru.mirea.lab4;

public class Atelier {
    public static void dressWomen(Clothes[] clothes)
    {
        for (int i = 0;i<clothes.length;i++)
        {
            if (clothes[i] instanceof WomenClothing)
            {
                System.out.println(clothes[i]);
            }
        }
    }

    public static void dressMan(Clothes[] clothes)
    {
        for (int i = 0;i<clothes.length;i++)
        {
            if (clothes[i] instanceof MenClothing)
            {
                System.out.println(clothes[i]);
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[] {
                new Pants(Sizes.M, 67, "Красный"),
                new Skirt(Sizes.XS, 32, "Зеленый")
        };
        System.out.println("Мужская одежда:");
        dressMan(clothes);
        System.out.println("Женская одежда:");
        dressWomen(clothes);
    }
}
