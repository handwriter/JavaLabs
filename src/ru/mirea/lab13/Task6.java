package ru.mirea.lab13;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine())
        {
            String filename = scanner.nextLine();
            String content = Files.readString(Path.of(filename));
            String[] parts = content.split(" ");
            System.out.println(getLine(List.of(parts)));
        }
    }

    public static String getLine(List<String> words) {
        if (words.isEmpty()) return "";

        for (int i = 0; i < words.size(); i++)
        {
            List<String> tempList = new ArrayList<>(words);
            StringBuilder result = new StringBuilder();
            String currentWord = tempList.remove(i);
            result.append(currentWord);

            while (!tempList.isEmpty())
            {
                boolean found = false;
                for (int j = 0; j < tempList.size(); j++)
                {
                    String nextWord = tempList.get(j);
                    if (currentWord.charAt(currentWord.length() - 1) == nextWord.charAt(0))
                    {
                        result.append(" ").append(nextWord);
                        currentWord = nextWord;
                        tempList.remove(j);
                        found = true;
                        break;
                    }
                }
                if (!found)
                {
                    break;
                }
            }

            if (tempList.isEmpty())
            {
                return result.toString();
            }
        }
        return "";
    }
}
