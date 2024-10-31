package trash123.interfaces.exc07;

public class MainSort {
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
        int[] arr2 = {
                4, 2,
                0,
                300,
                1,
                6,
                8
        };

        // Create an instance of BubbleSort and perform sorting
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.print("Bubble Sort: ");
        for (int i : arr) {
            System.out.println(i);

        }

        // Create an instance of SelectionSort and perform sorting
        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr2);
        System.out.print("Selection Sort: ");
        for (int i : arr2) {
            System.out.println(i);

        }
    }
}