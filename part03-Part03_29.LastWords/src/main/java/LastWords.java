
import java.util.ArrayList;
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputArray = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            inputArray.add(input);
        }
        for(String input: inputArray){
            String[] pieces = input.split(" ");
            System.out.println(pieces[pieces.length - 1]);
        }

    }
}
