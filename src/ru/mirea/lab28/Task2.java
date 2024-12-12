package ru.mirea.lab28;
import java.util.Collections;
import java.util.HashMap;

public class Task2 {
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Сергеевна", "Алла");
        map.put("Сергеева", "Арина");
        map.put("Карандашова", "Василиса");
        map.put("Кондрашов", "Егор");
        map.put("Тихонина", "Ирина");
        map.put("Тихонова", "Марфа");
        map.put("Гуслярцев", "Кирилл");
        map.put("Гусляренко", "Станислав");
        map.put("Яременко", "Петр");
        map.put("Мишина", "Светлана");
        return map;
    }

    public int getSameFirstNameCount(HashMap<String, String> map)
    {
        int count = 0;
        for (String value : map.values())
        {
            if (Collections.frequency(map.values(), value) > 1)
            {
                count += 1;
            }
        }
        return count;
    }

    public int getSameLastNameCount(HashMap<String, String> map)
    {
        return 0;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        System.out.println(map.get("Сергеевна"));
    }
}
