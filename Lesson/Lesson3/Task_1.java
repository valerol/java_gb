package Lesson.Lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
public class Task_1 {
    public static void main(String[] args) 
    {
        Task_1 task = new Task_1();
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Min value is: " + Collections.min(numbers));
        System.out.println("Max value is: " + Collections.max(numbers));
        System.out.println("Avarage value is: " + task.findAvarage(numbers));
    }

    public int findAvarage(List<Integer> numbers)
    {
        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }
        return (sum / numbers.size());
    }
}
