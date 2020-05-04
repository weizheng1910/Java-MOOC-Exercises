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
public class Points {

    private int passing;
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    private ArrayList<Integer> gradeFive;
    private ArrayList<Integer> gradeFour;
    private ArrayList<Integer> gradeThree;
    private ArrayList<Integer> gradeTwo;
    private ArrayList<Integer> gradeOne;
    private ArrayList<Integer> gradeZero;

    public Points() {
        this.passing = 50;
        this.points = new ArrayList<Integer>();
        this.passingPoints = new ArrayList<Integer>();
        this.gradeFive = new ArrayList<Integer>();
        this.gradeFour = new ArrayList<Integer>();
        this.gradeThree = new ArrayList<Integer>();
        this.gradeTwo = new ArrayList<Integer>();
        this.gradeOne = new ArrayList<Integer>();
        this.gradeZero = new ArrayList<Integer>();
    }

    public void add(int number) {
        if (number >= 0 && number <= 100) {
            this.points.add(number);

            if (number >= passing) {
                this.passingPoints.add(number);

                if (number < 60) {
                    this.gradeOne.add(number);
                } else if (number < 70) {
                    this.gradeTwo.add(number);
                } else if (number < 80) {
                    this.gradeThree.add(number);
                } else if (number < 90) {
                    this.gradeFour.add(number);
                } else {
                    this.gradeFive.add(number);
                }

            } else {
                this.gradeZero.add(number);
            }

        }

    }

    public double sum(ArrayList<Integer> array) {
        double sum = 0.0;
        for (Integer point : array) {
            sum += (double) point;
        }

        return sum;
    }

    public double average(ArrayList<Integer> array) {
        return sum(array) / array.size();
    }

    public double returnPointAverage() {
        return average(this.points);
    }

    public double returnPassingPointAverage() {
        return average(this.passingPoints);
    }

    public double returnPassPercentage() {
        return (double) passingPoints.size() / points.size() * 100;
    }

    public void printStars() {
        String printGradeFive = "";
        for (int i = 0; i < this.gradeFive.size(); i++) {
            printGradeFive += "*";
        }
        System.out.println("5: " + printGradeFive);

        String printGradeFour = "";
        for (int i = 0; i < this.gradeFour.size(); i++) {
            printGradeFour += "*";
        }
        System.out.println("4: " + printGradeFour);

        String printGradeThree = "";
        for (int i = 0; i < this.gradeThree.size(); i++) {
            printGradeThree += "*";
        }
        System.out.println("3: " + printGradeThree);

        String printGradeTwo = "";
        for (int i = 0; i < this.gradeTwo.size(); i++) {
            printGradeTwo += "*";
        }
        System.out.println("2: " + printGradeTwo);

        String printGradeOne = "";
        for (int i = 0; i < this.gradeOne.size(); i++) {
            printGradeOne += "*";
        }
        System.out.println("1: " + printGradeOne);

        String printGradeZero = "";
        for (int i = 0; i < this.gradeZero.size(); i++) {
            printGradeZero += "*";
        }
        System.out.println("0: " + printGradeZero);

    }

}
