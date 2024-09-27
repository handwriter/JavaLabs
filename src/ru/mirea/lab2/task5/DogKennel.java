package ru.mirea.lab2.task5;
import java.util.Arrays;
import java.util.Scanner;

public class DogKennel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog[] dogArr = new Dog[0];
        while (true)
        {
            System.out.println("\nКличка собаки: ");
            String dogName = scanner.hasNext() ? scanner.next() : "";
            System.out.println("Возраст собаки: ");
            int dogAge = scanner.hasNextInt() ? scanner.nextInt() : 0;
            if (!dogName.isEmpty() && dogAge != 0)
            {
                Dog newDog = new Dog(dogName, dogAge);
                Dog[] newDogArr = new Dog[dogArr.length + 1];
                System.arraycopy(dogArr, 0, newDogArr, 0, dogArr.length);
                newDogArr[newDogArr.length-1] = newDog;
                dogArr = newDogArr;
            }
            System.out.print(Arrays.toString(dogArr));
        }
    }
}
