package ru.mirea.lab24;

public class Client {
    private Chair chair;

    public void sit() {
        if (chair == null) return;
        System.out.println("Сижу на: " + chair.GetType());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
