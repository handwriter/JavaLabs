package ru.mirea.lab13;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String data) {
        String[] parts = data.split(",");
        if (parts.length != 4) {
            return;
        }
        this.id = parts[0];
        this.name = parts[1];
        this.color = parts[2];
        this.size = parts[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
