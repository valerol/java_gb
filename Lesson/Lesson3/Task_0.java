package Lesson.Lesson3;
// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Task_0 {
    
    public static void main(String[] args) 
    {
        Task_0 task = new Task_0();
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(task.removeEven(numbers));
    }

    public List<Integer> removeEven(List<Integer> numbers) 
    {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }
        return numbers;
    }
}
