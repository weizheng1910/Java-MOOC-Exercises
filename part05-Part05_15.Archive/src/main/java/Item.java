/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author weizheng
 */
public class Item {

    private String identifier;
    private String name;

    public Item(String name, String identifier) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getIden(){
        return this.identifier;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return false;
        }

        Item o = (Item) compared;

        if (this.identifier.equals(o.identifier)) {
            return true;
        }

        return false;
    }

}
