
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        try ( Scanner fileObject = new Scanner(Paths.get(file))) {
            while (fileObject.hasNextLine()) {
                String personCSV = fileObject.nextLine();
                String[] splittedData = personCSV.split(",");

                String personName = splittedData[0];
                int personAge = Integer.valueOf(splittedData[1]);

                Person newPerson = new Person(personName, personAge);
                persons.add(newPerson);

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return persons;

    }
}
