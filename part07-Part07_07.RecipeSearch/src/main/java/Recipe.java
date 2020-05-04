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
public class Recipe {

    private int time;
    private String name;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time) {
        this.time = time;
        this.name = name;
        this.ingredients = new ArrayList<String>();
    }

    public void addIngredients(String name) {
        ingredients.add(name);
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public boolean containsIngredient(String ingredient) {

        if (ingredients.size() == 0) {
            return false;
        }
        
        for (String element : ingredients) {
            if (element.equals(ingredient)) {
                return true;
            }
        }

        return false;
    }

    public String toString() {
        return getName() + ", cooking time: " + getTime();
    }
}
