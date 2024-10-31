package trash123.interfaces.exc07;

public class BubbleSort implements Sortable {

    @Override
    public void sort(int[] arr) {
        System.out.println("Bubble sorting");
        int n = arr.length;

        //outer loop
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparisons and swaps
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //inner loop
    }
}