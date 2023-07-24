package Lesson.ToyMarket;

import java.util.Random;

public class Toy {
    
    private static int counter = 0; // to calc the id
    private final int id;
    private String name;
    private int amount;
    private int prob; // probability of winning in %

    Random rand = new Random();

    public Toy(String name, int amount) {
        this.id = ++counter;
        this.name = name;
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getName() {
        return this.name;
    }

    public void setProb(int prob) {
        this.prob = prob;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Using the probability to decide give it as a price or not
     */
    public boolean canWin() {
        return this.prob > 0 ? rand.nextInt(100 / this.prob) == 0 : false;
    }

    @Override
    public String toString() {
        return String.format("id: %d, name: %s, amount: %d, probability: %d", this.id, this.name, this.amount, this.prob);
    }

}
