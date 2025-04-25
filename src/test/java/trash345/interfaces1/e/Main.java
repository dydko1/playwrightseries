package trash345.interfaces1.e;

public class Main {
    public static void main(String[] args) {
        // Create an array of integers to be sorted
        int[] arr = {
                4,
                2,
                0,
                3,
                1,
                6,
                8
        };

        // Create an instance of BubbleSort and perform sorting
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.print("Bubble Sort: ");
        printArray(arr);

        // Create an instance of SelectionSort and perform sorting
        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.print("Selection Sort: ");
        printArray(arr);
    }

    // Method to print the elements of an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}