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
public class Stack {
    
    private ArrayList<String> list;
    
    public Stack(){
        this.list = new ArrayList<String>();
    }
    
    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    
    public void add(String value){
        this.list.add(value);
    }
    
    public ArrayList<String> values(){
        return this.list;
    }
    
    public String take(){
        int indexOfLastElement = this.list.size() - 1;
        return this.list.remove(indexOfLastElement);
    }
}
