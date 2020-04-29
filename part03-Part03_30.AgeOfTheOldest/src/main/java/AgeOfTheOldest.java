
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

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
        
        int indexOfOldest = 0;
        int maxAgeValue = 0;
        for(int i = 0; i < inputArray.size(); i++){
            String[] pieces = inputArray.get(i).split(",");
            if(Integer.valueOf(pieces[1]) > maxAgeValue){
                maxAgeValue = Integer.valueOf(pieces[1]);
                indexOfOldest = i;
            }
        }
        
        System.out.println("Age of the oldest: " + maxAgeValue);


    }
}
