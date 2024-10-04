package ru.mirea.lab4;

public class Tester {
    public enum YearPart
    {
        SUMMER(23) {
            public String getDescription() {
                return "Жаркое время года";
            }
        },
        AUTUMN(9),
        WINTER(-5),
        SPRING(8)
        ;
        private final float averageTemp;
        YearPart(float averageTemp)
        {
            this.averageTemp = averageTemp;
        }

        public float getAverageTemp() {
            return averageTemp;
        }

        public String getDescription()
        {
            return "Холодное время года";
        }

        @Override
        public String toString() {
            return "\nНазвание: " + name() + "\nСредняя температура: " + getAverageTemp() +
                    "\nОписание: " + getDescription() + "\n";
        }
    }

    public static void CheckPart(YearPart part)
    {
        switch (part)
        {
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
        }
    }

    public static void main(String[] args) {
        YearPart yearPart = YearPart.AUTUMN;
        System.out.print(yearPart);
        for (YearPart part : YearPart.values()) {
            System.out.println(part);
        }
    }
}
