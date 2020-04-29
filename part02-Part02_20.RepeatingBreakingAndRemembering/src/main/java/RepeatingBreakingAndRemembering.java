
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int numberOfEvenNumbers = 0;
        int numberOfOddNumbers = 0;
   
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            sum += number;
            count++;
            
            if(number % 2 == 0){
                numberOfEvenNumbers++;
            } else {
                numberOfOddNumbers++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + ((float)sum/count));
        System.out.println("Even: " + numberOfEvenNumbers);
        System.out.println("Odd: " + numberOfOddNumbers);
    }
}
