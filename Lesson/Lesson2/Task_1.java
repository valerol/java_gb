package Lesson.Lesson2;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_1 {
    // Вам дается строка S и целочисленный массив индексов int index[s.length].
    // Напишите программу, которая перетасует символы в S таким образом,
    // что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
    //
    // Пример: s = “cba”, index = [3,2,1] result “abc”
    ArrayList<String> inputs = new ArrayList<>(2);
    public static void main(String[] args)
    {
        Task_1 task = new Task_1();
        task.inputArr();
        System.out.println(task.shuffle(task.inputs.get(0), task.intArr(task.inputs.get(1))));
    }

    public void inputArr() 
    {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            inputs.add(in.nextLine()); // cba, 3,2,1
        }
        in.close();
    }   

    public int[] intArr(String index_input) 
    {
        String[] index_arr = index_input.split(",");
        int size = index_arr.length;
        int [] index = new int[size];
        for(int i = 0; i < size; i++) {
            index[i] = Integer.parseInt(index_arr[i]);
        }
        return index;
    }

    public String shuffle(final String S, final int[] index) 
    {
        String [] letters = S.split("");
        StringBuilder sortedS = new StringBuilder();
        sortedS.setLength(letters.length);
        for(int i = 0; i < letters.length; i++) {
            sortedS.insert(index[i], letters[i]);
        }
        return sortedS.toString();
    }
}