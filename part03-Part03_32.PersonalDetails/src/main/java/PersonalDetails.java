
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

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
        
        String longestName = "";
        int sum = 0;
        for(int i = 0; i < inputArray.size(); i++){
            String[] pieces = inputArray.get(i).split(",");
            if(pieces[0].length() > longestName.length()){
                longestName = pieces[0];
            }
            
            sum += Integer.valueOf(pieces[1]);
        }
        
        double average = sum * 1.0 / inputArray.size();
        
        
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years " + average);


    }
}
