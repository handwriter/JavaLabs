package ru.mirea.lab4_1;

class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone()
    {

    }

    public Phone(String number, String model)
    {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight)
    {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String callerNumber)
    {
        System.out.println("Звонит " + name + " с номера " + callerNumber);
    }

    public String getNumber()
    {
        return number;
    }

    public void sendMessage(String... numbers)
    {
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    public double getWeight()
    {
        return weight;
    }

    public String getModel()
    {
        return model;
    }

    public void printInfo()
    {
        System.out.println("Модель: " + model + ", Номер: " + number + ", Вес: " + weight);
    }

    public static void main(String[] args)
    {
        Phone phone1 = new Phone("8 909 999 75-68", "Model A", 12);
        Phone phone2 = new Phone("8 344 578 90-98", "Model B", 15);
        Phone phone3 = new Phone("8 999 122 22-21", "Model C");
        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();
        phone1.receiveCall("Num1");
        phone1.receiveCall("TestNum", "8 345 567 89-92");
        phone1.sendMessage("8 909 999 75-68", "8 344 578 90-98", "8 999 122 22-21");
    }
}