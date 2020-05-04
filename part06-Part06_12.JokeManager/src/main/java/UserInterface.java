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

    private Scanner scanner;
    private JokeManager manager;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void start() {
        while (true) {
            System.out.println("Commands: \n 1 - add a joke \n 2 - draw a joke \n 3 - list jokes \n X - stop");
            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                manager.addJoke(joke);
            }

            if (command.equals("2")) {
                System.out.println(manager.drawJoke());
            }

            if (command.equals("3")) {
                manager.printJokes();
            }
        }

    }

}
