package ru.mirea.lab4;

public enum Sizes {
    XXS(36) {
        @Override
        String getDescription() {
            return "Детский размер";
        }
    }
    ,
    XS(38),
    S(40),
    M(42),
    L(44)
    ;
    private final int euroSize;
    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize()
    {
        return euroSize;
    }

    String getDescription()
    {
        return "Взрослый размер";
    }

    @Override
    public String toString() {
        return name() + " " + getDescription();
    }
}
