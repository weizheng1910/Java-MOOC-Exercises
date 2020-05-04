
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        RecipeList list = new RecipeList();
        
        // Adding Recipes from file to the list
        try ( Scanner scan = new Scanner(Paths.get(file))) {

            while (scan.hasNextLine()) {
                String meal = scan.nextLine();
                if (scan.hasNextInt()) {
                    int time = Integer.valueOf(scan.nextLine());
                    Recipe recipe = new Recipe(meal, time);

                    while (scan.hasNextLine()) {
                        String element = scan.nextLine();
                        if (element.isEmpty()) {
                            break;
                        }
                        recipe.addIngredients(element);
                    }

                    list.addRecipe(recipe);

                } else {
                    continue;
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        
        System.out.println(
                "\nCommands: \n"
                + "list - list the recipes \n"
                + "stop - stops the program \n"
                + "find name - find recipe \n"
                + "find cooking time - find recipe below said time\n"
                + "find ingredient - find recipe with said ingredients");

        while (true) {
            System.out.println("\n" + "Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                list.getList();

            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                list.searchRecipe(word);

            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                Integer maxTime = Integer.valueOf(scanner.nextLine());
                list.findCookingTime(maxTime);

            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                list.findRecipeWithIngredient(ingredient);

            }
        }

    }
}
