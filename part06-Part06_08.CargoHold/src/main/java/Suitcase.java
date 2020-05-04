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
public class Suitcase {

    private int maximumTotalWeight;
    private ArrayList<Item> items;
    private int currentWeight;

    public Suitcase(int maximumTotalWeight) {
        this.maximumTotalWeight = maximumTotalWeight;
        this.items = new ArrayList<Item>();
        this.currentWeight = 0;

    }

    public void addItem(Item item) {
        if (this.currentWeight + item.getWeight() <= this.maximumTotalWeight) {
            this.items.add(item);
            this.currentWeight += item.getWeight();
        }

    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.currentWeight + " kg)";
        } else {
            return this.items.size() + " items (" + this.currentWeight + " kg)";
        }

    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return this.currentWeight;
    }

    public Item heaviestItem() {
        if(items.size() == 0){
            return null;
        }
        Item heaviest = items.get(0);
        for (Item item : items) {
            if(item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
}
