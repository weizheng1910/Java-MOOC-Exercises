/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author weizheng
 */
public class RecipeList {

    private ArrayList<Recipe> list;

    public RecipeList() {
        this.list = new ArrayList<Recipe>();
    }

    public void addRecipe(Recipe recipe) {
        list.add(recipe);
    }

    public void printSize() {
        System.out.println(list.size());
    }

    public void getList() {
        System.out.println("\n" + "Recipes");
        for (Recipe recipe : list) {
            System.out.println(recipe);
        }
    }

    public void searchRecipe(String word) {
        System.out.println("\n" + "Recipes");
        for (Recipe recipe : list) {
            if (recipe.getName().contains(word)) {
                System.out.println(recipe);
            }
        }
    }

    public void findCookingTime(int time) {
        System.out.println("\n" + "Recipes");
        for (Recipe recipe : list) {
            if (recipe.getTime() <= time) {
                System.out.println(recipe);
            }
        }
    }

    public void findRecipeWithIngredient(String ingredient) {
        System.out.println("\n" + "Recipes");
        for (Recipe recipe : list) {
            if (recipe.containsIngredient(ingredient) == true) {
                System.out.println(recipe);
            }
        }
    }

}
