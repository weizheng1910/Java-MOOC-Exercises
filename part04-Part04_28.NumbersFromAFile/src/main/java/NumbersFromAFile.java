
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try ( Scanner fileObject = new Scanner(Paths.get(file))) {
            int validNumbers = 0;
            while (fileObject.hasNextLine()) {
                int number = Integer.valueOf(fileObject.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    validNumbers++;
                }
                
                
            }
            
            System.out.println("Numbers: " + validNumbers);
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
