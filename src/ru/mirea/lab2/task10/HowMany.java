package ru.mirea.lab2.task10;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод (через пробел): ");
        String input = sc.nextLine().strip();
        int count = 0;

        if (!input.isEmpty()){
            count += 1;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ')
                {
                    count += 1;
                }
            }
        }

        System.out.println("Вы ввели "+count+" слов");
    }
}
