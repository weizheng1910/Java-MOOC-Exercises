/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author weizheng
 */
public class Container {

    private int volume;
    private int max;

    public Container() {
        this.volume = 0;
        this.max = 100;
    }

    public int contains() {
        return volume;
    }

    public void add(int amount) {
        if (amount > 0) {
            volume += amount;
            if (volume > max) {
                volume = max;
            }
        }
    }
    
    public void remove(int amount){
        if(volume - amount > 0){
            volume -= amount;
        } else {
            volume = 0;
        }
    }
    
    public String toString() {
        return volume + "/" + max;
    }
}
