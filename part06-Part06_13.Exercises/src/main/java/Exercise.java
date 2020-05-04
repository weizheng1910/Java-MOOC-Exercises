/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author weizheng
 */
public class Exercise {
    private String name;
    private Boolean completed;
    
    public Exercise(String name){
        this.name = name;
        this.completed = false;
    }
    
    public void markCompleted(){
        this.completed = true;
    }
    
    public boolean isCompleted(){
        return this.completed;
    }
    
    public boolean equals(Object o){
        
        
        if(!(o instanceof Exercise)){
            return false;
        }
        
        Exercise oo = (Exercise) o;
        
        if(oo.name == this.name){
            return true;
        }
        
        return false;
    }
    
    
}
