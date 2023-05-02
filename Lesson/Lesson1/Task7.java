package Lesson.Lesson1;
import java.util.ArrayList;
import java.util.Scanner;
import Task.Task;

public class Task7 extends Task {

    ArrayList<Integer> inputArray = new ArrayList<Integer>();
    ArrayList<Integer> outputArray = new ArrayList<Integer>();

    public Task7(String name, String description)
    {
        super(name, description);
    }

    public void execute() 
    {
        setInputArray();
        getUnicNums();
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

    public void getUnicNums() {
        ArrayList<Integer> checkArray = new ArrayList<Integer>();
        for (int i = 1; i < inputArray.size(); i++) {
            if (outputArray.contains(inputArray.get(i))) {
                outputArray.remove(inputArray.get(i));
                checkArray.add(inputArray.get(i));
            } else {
                outputArray.add(inputArray.get(i));
            }
        }
        for (int i = 0; i < checkArray.size(); i++) {
            if (outputArray.contains(checkArray.get(i))) {
                outputArray.remove(checkArray.get(i));
            }
        }
    }

    public static void main(String[] args){
    }
}