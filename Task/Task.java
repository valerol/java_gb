package Task;

public abstract class Task
{
    String name;
    String description;

    public Task(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public void printSummary()
    {
        System.out.println("\n\r*** " + name.toUpperCase() + " ***" + "\n\r" + description);
    }

    public abstract void execute();
}
