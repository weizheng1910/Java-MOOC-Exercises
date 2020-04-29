
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        // Write your program here
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.\n" +
"What is the main character called?");
        String person = scanner.nextLine();
        System.out.println("What is their job?");
        String job = scanner.nextLine();
        System.out.println("Here is the story:\n" +
"Once upon a time there was " + person + ", who was " + job + ".\n" +
"On the way to work, " + person + " reflected on life.\n" +
"Perhaps " + person + " will not be " + job + " forever.");
    }
}
