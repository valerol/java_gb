package Lesson.Lesson1;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.InputMismatchException;
import Task.Task;

public class SimpleCalc extends Task
{
    float x;
    float y;

    public SimpleCalc(String name, String description)
    {
        super(name, description);
    }

    public void execute() 
    {
        setNumbers();

        Set<Operation> operations = new HashSet<>();
        operations.add(new Addition(x,y));
        operations.add(new Subtraction(x,y));
        operations.add(new Multiplication(x,y));
        operations.add(new Division(x,y));

        for (Operation operation : operations) {
            operation.printResult();
        }
    }

    public void setNumbers()
    {
        System.out.println("Enter a couple of numbers:");
        try {
            Scanner in = new Scanner(System.in);
            x = in.nextFloat();
            y = in.nextFloat();
            in.close();
            // я не понимаю, где его правильно закрыть, здесь он не дает повторно ввести после исключения, и следующему заданию мешает
        } catch(InputMismatchException e) {
        }
    }
}

abstract class Operation
{
    String name = "some operation";
    float num1;
    float num2;

    public Operation(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getName()
    {
        return name;
    }

    public abstract float execute();

    public void printResult()
    {
        System.out.println("The result of " + name + 
        " of " + num1 + " and " + num2 + " = " + execute());
    }
}

class Addition extends Operation
{
    public Addition(float num1, float num2)
    {
        super(num1, num2);
        this.name = "addition";
    }

    public float execute()
    {
        return num1 + num2;
    }
}

class Subtraction extends Operation
{
    public Subtraction(float num1, float num2)
    {
        super(num1, num2);
        this.name = "subtraction";
    }

    public float execute()
    {
        return num1 - num2;
    }
}

class Multiplication extends Operation
{
    public Multiplication(float num1, float num2)
    {
        super(num1, num2);
        this.name = "multiplication";
    }

    public float execute()
    {
        return num1 * num2;
    }
}

class Division extends Operation
{
    public Division(float num1, float num2)
    {
        super(num1, num2);
        this.name = "division";
    }

    public float execute()
    {
        return num1 / num2;
    }
}