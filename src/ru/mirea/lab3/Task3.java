package ru.mirea.lab3;
import java.util.Arrays;
import java.util.Random;

//Task3
public class Task3 {
    public static void main(String[] args) {
        int[] nums = new int[4];
        Random rnd = new Random();
        for (int i = 0;i < nums.length;i++)
        {
            nums[i] = 10 + rnd.nextInt(90);
        }
        System.out.println(Arrays.toString(nums));
        if (nums[1] > nums[0] && nums[2] > nums[1] && nums[3] > nums[2])
        {
            System.out.print("Последовательность строго возрастает");
        }
        else
        {
            System.out.print("Последовательность не строговозрастающая");
        }
    }
}
