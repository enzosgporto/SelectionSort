import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] randomList = {5, 6, 29, 65, 32, 45, 67, 98, 3, 55, 3, 1, 900};

        int[] orderedList = bubbleSort(randomList);
        System.out.println(Arrays.toString(orderedList));

    }

    public static int[] bubbleSort(int[] array) {
        int minIndex;

        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    swap(array, minIndex, j);
                }
            }
        }

        return array;
    }

    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int placeholder = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = placeholder;
    }

}