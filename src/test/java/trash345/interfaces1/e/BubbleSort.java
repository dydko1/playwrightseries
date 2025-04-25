package trash345.interfaces1.e;

class BubbleSort implements Sortable {
    // Implement the "sort" method required by the Sortable interface
    public void sort(int[] arr) {
        // Get the length of the array
        int n = arr.length;

        // Outer loop for the number of passes
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
    }
}