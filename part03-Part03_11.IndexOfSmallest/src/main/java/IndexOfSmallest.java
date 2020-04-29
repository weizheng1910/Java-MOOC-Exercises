
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        int smallestNumber = 9999;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 9999){
                break;
            }
            
            if(input < smallestNumber){
                smallestNumber = input;
            } 
            list.add(input);
        }
        
        System.out.println("Smallest number: " + smallestNumber);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == smallestNumber){
                System.out.println("Found at index: " + i);
            }
        }
        
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
