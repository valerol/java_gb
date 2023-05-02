package Lesson.Lesson2;
import java.util.Scanner;
import java.util.ArrayList;

public class Task_0 {

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

    ArrayList<String> inputs = new ArrayList<>(2);

    public static void main(String[] args) 
    {
        Task_0 task = new Task_0();
        task.inputArr();
        System.out.println(task.findJewelsInStones(task.inputs.get(0), task.inputs.get(1)));
    }

    public void inputArr() 
    {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            inputs.add(in.nextLine());
        }
        in.close();
    }

    public String findJewelsInStones(String jewels, String stones) 
    {
        char[] jwls = jewels.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < jwls.length; i++) {
            int count = stones.length() - stones.replace(String.valueOf(jwls[i]), "").length();
            res.append(jwls[i]);
            res.append(count);
        }

        return res.toString();
    }
}