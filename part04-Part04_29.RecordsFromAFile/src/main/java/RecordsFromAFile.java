
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();

        try ( Scanner fileObject = new Scanner(Paths.get(fileName))) {
            while (fileObject.hasNextLine()) {
                String row = fileObject.nextLine();
                String[] splittedData = row.split(",");
                String name = splittedData[0];
                String age = splittedData[1];

                if (Integer.valueOf(age) == 1) {
                    age = splittedData[1] + " year";
                } else {
                    age = splittedData[1] + " years";
                }

                System.out.println(name + ", " + age);

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
