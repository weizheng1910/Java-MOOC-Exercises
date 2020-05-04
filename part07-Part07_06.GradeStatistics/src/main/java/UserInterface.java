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
    private Points points;

    public UserInterface(Scanner scan, Points points) {
        this.scan = scan;
        this.points = points;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            Integer input = Integer.valueOf(scan.nextLine());
            if (input == -1) {
                break;
            }

            if (input >= 0) {
                points.add(input);

            }

        }
        printAverage();
        printPassingPointAverage();
        printPassPercentage();
        printStars();

    }

    public void printAverage() {
        System.out.println("Point average (all): " + points.returnPointAverage());
    }

    public void printPassingPointAverage() {
        if (Double.isNaN(points.returnPassingPointAverage())) {
            System.out.println("Point average (passing): " + "-");
        } else {
            System.out.println("Point average (passing): " + points.returnPassingPointAverage());
        }
    }

    public void printPassPercentage() {
        System.out.println("Pass percentage: " + points.returnPassPercentage());
    }

    public void printStars() {
        points.printStars();
    }
}
