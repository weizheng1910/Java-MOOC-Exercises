
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(array);
    }

    public static int smallest(int[] array) {
        int smallest = 99999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];

            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = Integer.MAX_VALUE;
        int index = -1;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            MainProgram.swap(array, i, indexOfSmallestFrom(array, i));
            String result = "";
            for (int element : array) {
                result += element;
                result += ", ";
            }
            System.out.println(result);
        }

    }

}
