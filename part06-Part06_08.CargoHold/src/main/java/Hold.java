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
public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    private int currentWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.currentWeight = 0;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight + suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
            this.currentWeight += suitcase.totalWeight();
        }

    }
    
    public String toString(){
        return this.suitcases.size() + " suitcases (" + this.currentWeight + " kg)"; 
    }
    
    public void printItems(){
        for(Suitcase suitcase: suitcases){
            suitcase.printItems();
        }
    }

}
