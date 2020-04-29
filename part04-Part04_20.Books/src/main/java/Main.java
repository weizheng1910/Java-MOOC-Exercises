
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> listOfBooks = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = scan.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.println("Publication Year: ");
            int year = Integer.valueOf(scan.nextLine());

            Book newBookInstance = new Book(title, pages, year);
            listOfBooks.add(newBookInstance);

        }
        
        System.out.println("What information will be printed? ");
        String detailShown = scan.nextLine();
        if(detailShown.equals("everything")){
            for(Book book: listOfBooks){
                System.out.println(book.getAllDetails());
            }
        } else if(detailShown.equals("name")){
            for(Book book: listOfBooks){
                System.out.println(book.getTitle());
            }
        }
        

    }
}
