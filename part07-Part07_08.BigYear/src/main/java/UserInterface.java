/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author weizheng
 */
public class UserInterface {

    private Scanner scan;
    private BirdList list;

    public UserInterface(Scanner scan, BirdList list) {
        this.list = list;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latin = scan.nextLine();
                list.addBird(new Bird(name, latin));
            } else if (command.equals("Observation")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                list.addObservationToBird(name);
            } else if (command.equals("All")) {
                list.printBirds();
            } else if (command.equals("One")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                list.printBird(name);

            } else if (command.equals("Quit")) {
                break;
            }
        }
    }
}
