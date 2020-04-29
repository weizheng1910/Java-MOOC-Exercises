
import java.util.ArrayList;
import java.util.Scanner;

public class AVClub {

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
        
        for (String input : inputArray) {
            String[] inputSplit = input.split(" ");
            for (String character : inputSplit) {
                if(character.contains("av")){
                    System.out.println(character);
                }
            }
        }

    }
}
