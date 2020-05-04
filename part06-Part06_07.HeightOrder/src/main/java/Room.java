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
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<Person>();
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public void add(Person person){
        this.persons.add(person);
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortest = persons.get(0);
        for (Person person : persons) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }

        return shortest;
    }

    public Person take() {
        Person shortest = this.shortest();
        this.persons.remove(shortest);
        return shortest;

    }
}
