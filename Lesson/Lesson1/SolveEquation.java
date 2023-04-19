package Lesson.Lesson1;

import java.util.ArrayList;
import java.util.Scanner;

import Task.Task;

public class SolveEquation extends Task {

    String equation;
    ArrayList<String> solutions = new ArrayList<>();

    public SolveEquation(String name, String description)
    {
        super(name, description);
    }

    public void execute() 
    {
        setEquation();

        ArrayList<Integer> vars = new ArrayList<>();

        for (int i = 0; i < equation.length(); i++) {
            
            if (equation.charAt(i) == '?') {
                vars.add(0);
            }
        }
       
        tryNumbers(0, vars);

        if (solutions.size() > 0) {
            System.out.println("Possible solutions: " + solutions);
        } else {
            System.out.println("No solutions");
        }
    }

    public void setEquation()
    {
        System.out.println("Print equation:");
        Scanner in = new Scanner(System.in);
        this.equation = in.next();

        while (!equation.matches("^(\\d|\\?)+\\+(\\d|\\?)+\\=(\\d|\\?)+$")) {
            System.out.println("Incorrect equation! Try again:");
            this.equation = in.next();
        }

        in.close();
    }

    public void tryNumbers(Integer nextElem, ArrayList<Integer> vars) {

        checkEquation(vars);

        for (int i = 0; i < 10 && nextElem < vars.size(); i++) {

            if (vars.get(nextElem) != i) {
                vars.set(nextElem, i);
                tryNumbers(nextElem + 1, vars);
            } 
        } 
    }

    public void checkEquation(ArrayList<Integer> vars)
    {
        String equationVariant = prepareEquation(vars);
        String[] numbers = equationVariant.split("[+=]");
        int num1 = Integer.valueOf(numbers[0]);
        int num2 = Integer.valueOf(numbers[1]);
        int sum = Integer.valueOf(numbers[2]);

        if (num1 > 0 && num2 > 0 && sum > 0 && num1 + num2 == sum) 
        {
            solutions.add(equationVariant);
        }
    }

    public String prepareEquation(ArrayList<Integer> vars)
    {
        char[] equationChars = equation.toCharArray();
        int counter = 0;
         
        for (int i = 0; i < equationChars.length && counter < vars.size() ; i++) {

            if (equationChars[i] == '?') {
                equationChars[i] = Character.forDigit(vars.get(counter), 10);
                counter++;
            }
        }

        return String.valueOf(equationChars);
    }
}
