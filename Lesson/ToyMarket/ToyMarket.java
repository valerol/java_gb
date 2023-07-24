package Lesson.ToyMarket;

import java.util.Random;

public class ToyMarket {

    private String[] names = {"bear", "hare", "cat", "fox", "dog", "hamster", "duck"};
    private Toy[] toys = new Toy[names.length];
    private int totalAmount;

    Random rand = new Random();

    public void Play() {
        Toy prize = this.winPrice();
        System.out.println("\nYou won a " + prize.getName() + "\n");
        prize.setAmount(prize.getAmount() - 1);
        this.calculateToys();
    }

    public Toy winPrice() {
        // First: take random toy
        Toy prize = toys[rand.nextInt(0, toys.length - 1)];
        // Second: execute probability random
        return prize.canWin() ? prize : this.winPrice();
    }

    public void GenerateToys() {
        for (int i = 0; i < names.length; i++) {
            toys[i] = new Toy(names[i], rand.nextInt(1, 3));
        }

        this.calculateToys();
    }

    /**
     * After generation or giving the toy, 
     * we need to recalculate the probability dependently on amount
    */
    public void calculateToys() {
        System.out.println("We have: ");
        
        totalAmount = 0;

        for (Toy toy : toys) {
            totalAmount += toy.getAmount();
        }

        if (totalAmount < 1) {
            this.GenerateToys();
        } else {
            for (Toy toy : toys) {
                // setting provbability dependently on amount of such a toy
                toy.setProb(toy.getAmount() < 1 ? 0 : toy.getAmount()*100/totalAmount);
                System.out.println(toy);
            }
        }
    }    
}
