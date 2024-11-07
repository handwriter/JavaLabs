package ru.mirea.lab22;

public class Task2 {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        view.setVisible(true);
    }
}
