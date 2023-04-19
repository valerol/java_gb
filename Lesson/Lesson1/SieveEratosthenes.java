package Lesson.Lesson1;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import Task.Task;

public class SieveEratosthenes extends Task
{
    int n = 1000;
    SortedSet<Integer> primeNumbers = new TreeSet<Integer>();

    public SieveEratosthenes(String name, String description)
    {
        super(name, description);
    }

    public void execute() 
    {
        System.out.println("Here is the set of prime numbers from 1 to " +
        n + ":" + findPrimeNumbers());
    }

    public Set<Integer> findPrimeNumbers() {
        for (int i = 1; i <= n; i++) {
            if (i == 3 || i == 5 || i == 7 || 
                (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
