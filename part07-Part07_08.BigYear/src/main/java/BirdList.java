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
public class BirdList {

    private ArrayList<Bird> birds;

    public BirdList() {
        this.birds = new ArrayList<Bird>();
    }

    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public Bird findBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }

        return null;
    }

    public void addObservationToBird(String name) {
        Bird bird = findBird(name);
        if (bird == null) {
            System.out.println("Not a bird!");
        } else {
            bird.addObservation();
        }
    }

    public void printBird(String name) {
        Bird bird = findBird(name);
        if (bird == null) {
            System.out.println("Not a bird!");
        } else {
            System.out.println(bird);
        }

    }

    public void printBirds() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

}
