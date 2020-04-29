
public class AdvancedAstrology {

    public static String printStars(int number) {
        // first part of the exercise
        String stars = "";
        for (int i = 1; i <= number; i++) {
            stars += "*";
        }
        
        return stars;
    }

    public static String printSpaces(int number) {
        // part 1 of the exercise
        String space = "";
        for (int i = 1; i <= number; i++) {
            space += " ";
        }
    
        return space;
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            System.out.println(printSpaces(size - i) + printStars(i));
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int maximumStarsPerRow = 2 * height - 1;
        for (int i = 1; i <= height; i++) {
            System.out.println(printSpaces(height - i) + printStars(2 * i - 1) + printSpaces(height - i));
        }
        System.out.println(printSpaces((2 * height - 3) / 2) + printStars(3) + printSpaces((2 * height - 3) / 2));
        System.out.println(printSpaces((2 * height - 3) / 2) + printStars(3) + printSpaces((2 * height - 3) / 2));
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
