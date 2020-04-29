
import java.util.Scanner;

public class LeapYear {
    // Years which are divisible by 100 are divisible by 4.
    // If you check if they are divisible by 4 first, the years which are divisible by 100 are goind to pass the test.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = Integer.valueOf(scan.nextLine());
        if ( year % 100 == 0){
            if(year % 400 == 0){
                System.out.println("The year is a leap year.");
            } else {
                System.out.println("The year is not a leap year.");
            }
        } else {
            if(year % 4 == 0){
                System.out.println("The year is a leap year.");
            } else {
                System.out.println("The year is not a leap year.");
            }
        }

    }
}
