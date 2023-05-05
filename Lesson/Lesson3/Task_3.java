package Lesson.Lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.

public class Task_3 {
    
    public static void main(String[] args) 
    {
        Task_3 task = new Task_3();
        List<String> planets = new ArrayList<>(Arrays.asList
        ("Плутон", "Уран", "Нептун", "Земля", "Марс", "Юпитер", "Венера", "Сатурн", "Нептун", "Венера", "Земля", "Нептун"));
        task.numberRepeats(planets);
    }

    public void numberRepeats(List<String> planets)
    {
        List<String> planet_names = new ArrayList<>(planets.size());
        int[] planet_count = new int[planets.size()];
        for (int i = 0; i < planets.size(); i++) {
            if (Collections.frequency(planet_names, planets.get(i)) < 1) {
                planet_names.add(planets.get(i));
                planet_count[i] = Collections.frequency(planets, planets.get(i));
            }
        }
        for (int i = 0; i < planet_names.size(); i++) {
            System.out.println(planet_names.get(i) + " - " + planet_count[i]);
        }
    }
}
