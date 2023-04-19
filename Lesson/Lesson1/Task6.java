package Lesson.Lesson1;
import java.util.ArrayList;
import java.util.Scanner;
import Task.Task;

public class Task6 extends Task {

    ArrayList<Integer> inputArray = new ArrayList<Integer>();
    ArrayList<Integer> outputArray = new ArrayList<Integer>();

    public Task6(String name, String description)
    {
        super(name, description);
    }

    public void execute() 
    {
        setInputArray();
        sumArray();
        System.out.println("result:");
        for (int i = 0; i < outputArray.size(); i++) {
            System.out.println(outputArray.get(i));
        }
    }

    public void setInputArray() {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            inputArray.add(in.nextInt());
            if (inputArray.size() == inputArray.get(0) + 1) {
                break;
            }
        }
        in.close();
    }

    public void sumArray() {
        outputArray.add(0);
        for (int i = 1; i < inputArray.size(); i++) {
            if (i % 2 != 0) {
                outputArray.set(0, outputArray.get(0) + inputArray.get(i));
                outputArray.add(inputArray.get(i));
            }
        }
    }

    public static void main(String[] args){
    }
}