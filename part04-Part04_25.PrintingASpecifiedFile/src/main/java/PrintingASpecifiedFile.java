
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();

        try ( Scanner file = new Scanner(Paths.get(fileName))) {
            
            while (file.hasNextLine()) {
                // we read one line
                String row = file.nextLine();
                // we print the line that we read
                System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}

