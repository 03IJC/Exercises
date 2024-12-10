public class InsertionSort {
    public static void main(String[] args) {
        //Initialize int array
        int[] arr = {1, 4, 2, 4, 6, 2, 9, 1};

        //Print out unsorted array
        System.out.print("Array to sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();

        //Call insertion sort method
        //insertionSort(arr);
        insertionSortPrinted(arr);

        //Print out sorted Array
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Sorts in int array using insertion sort
     * @param arr int array wanted to be sorted
     */
    public static void insertionSort(int[] arr) {
        //Iterate through entire array
        for (int i = 1; i < arr.length; i++) {
            //Initialize key as the value to move into place. Initialize j to the last portion of the sorted array
            int key = arr[i];
            int j = i - 1;
            //Iterate through sorted array and move each larger number than the key one to the right
            while (j > 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            //Place key in the correct spot
            arr[j + 1] = key;
        }
    }

    /**
     * Sorts in int array using insertion sort
     * Prints what it is doing
     * @param arr int array wanted to be sorted
     */
    public static void insertionSortPrinted(int[] arr) {
        //Iterate through entire array
        for (int i = 1; i < arr.length; i++) {
            //Initialize key as the value to move into place. Initialize j to the last portion of the sorted array
            int key = arr[i];
            int j = i - 1;
            //Print break down
            System.out.println("Current Index: " + i);
            System.out.println("Current Value: " + arr[i]);
            System.out.print("Current Array: ");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
            System.out.print("Sorted part:   ");
            for (int k = 0; k < j + 1; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
            System.out.print("Unsorted Part: ");
            for (int k = j + 1; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();

            //Iterate through sorted array and move each larger number than the key one to the right
            while (j > 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            System.out.println("Placing index " + i + " at index " + (j + 1));
            System.out.println();
            //Place key in the correct spot
            arr[j + 1] = key;
        }
    }
}
