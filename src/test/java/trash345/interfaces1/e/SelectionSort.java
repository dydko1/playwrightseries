package trash345.interfaces1.e;

class SelectionSort implements Sortable {
    // Implement the "sort" method required by the Sortable interface
    public void sort(int[] arr) {
        // Get the length of the array
        int n = arr.length;

        // Outer loop for the current element
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Inner loop to find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}