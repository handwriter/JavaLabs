package ru.mirea.lab24;

public class MagicChair implements Chair{
    @Override
    public String GetType() {
        return "Magic Chair";
    }

    public void doMagic() {
        System.out.println("MAGIC");
    }
}
