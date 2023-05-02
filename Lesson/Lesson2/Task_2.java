package Lesson.Lesson2;
import java.util.ArrayList;
import java.util.Scanner;

// Sample Input:

// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко
// Sample Output:

// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.

public class Task_2 {
    ArrayList<String> inputs = new ArrayList<>(2);
    public static void main(String[] args) 
    {
        Task_2 task = new Task_2();
        String [] recipe = task.productReplace(task.getInputs());
        for (int r = 0; r < recipe.length; r++) {
            System.out.println(recipe[r]);
        }
    }

    public String[][] getInputs() 
    {
        String[][] inputRes = new String[2][];
        Scanner in = new Scanner(System.in);
        int recipeCount = Integer.parseInt(in.nextLine());
        String [] recipeStrings = new String[recipeCount];
        for(int r = 0; r < recipeCount; r++) {
            recipeStrings[r] = in.nextLine();
        }
        int productCount = Integer.parseInt(in.nextLine());
        String [] productStrings = new String[productCount];
        for(int p = 0; p < productCount; p++) {
            productStrings[p] = in.nextLine();
        }
        in.close();
        inputRes[0] = recipeStrings; 
        inputRes[1] = productStrings;
        return inputRes;
    }

    public String[] productReplace(String[][] args)
    {
        String[] productStrings = args[0];
        for (int p = 0; p < args[1].length; p++) {
            String [] product = args[1][p].split(" - ");
            for (int r = 0; r < args[0].length; r++) {
                productStrings[r] = args[0][r].replace(product[0], product[1]).replace(
                    product[0].substring(0, 1).toUpperCase() + product[0].substring(1), 
                    product[1].substring(0, 1).toUpperCase() + product[1].substring(1));
            }
        }
        return productStrings;
    }
}
