package Lesson.Lesson1;
import java.util.Scanner;
import java.util.InputMismatchException;
import Task.Task;

public class NOperations extends Task
{
    public int n;
    public int t = 0;
    public int f = 1;

    public NOperations(String name, String description)
    {
        super(name, description);
    }

    public void execute() 
    {
        setN();
        System.out.println("Triangle number of " + n + " is " + calcT(n));
        System.out.println("Factorial of " + n + " is " + calcF(n));
    }

    public void inputN() 
    {
        System.out.println("Please enter a positive number:");
        try {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            in.close();
            // я не понимаю, где его правильно закрыть, здесь он не дает повторно ввести после исключения, и следующему заданию мешает
        } catch(InputMismatchException e) {
        }
    }

    public void setN() 
    {
        inputN();

        if (n < 1) {
            setN();
        }
    }

    public int calcT(int N) 
    {
        for (int i = 1; i <= N; i++) {
            t += i;
        }
        return t;
    }

    public int calcF(int N) 
    {
        for (int i = 1; i <= N; i++) {
            f *= i;
        }
        return f;
    }
}
