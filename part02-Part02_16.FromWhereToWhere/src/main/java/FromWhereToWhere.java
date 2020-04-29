
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int toWhere = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int fromWhere = Integer.valueOf(scanner.nextLine());
        
        for (int i = fromWhere; i <= toWhere; i++) {
            System.out.println(i);
        }
    }
}
