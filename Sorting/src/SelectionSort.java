public class SelectionSort {
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

        //Call selection sort method
        selectionSort(arr);
        //selectionSortPrinted(arr);

        //Print out sorted Array
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Sorts an int array using selection sort (Low to high).
     * @param arr
     */
    public static void selectionSort(int[] arr) {
        //Iterate through entire array
        for (int i = 0; i < arr.length; i++) {
            //Initialize and set a minimum index to first element of unsorted part
            int minIndex = i;

            //Iterate through unsorted array
            for (int j = i; j < arr.length; j++) {
                //Set minimum index to current index if minimum index's value is greater than current index's
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            //make the swap if the minimum index changed using a temp
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    /**
     * Sorts an int array using selection sort (Low to high).
     * Prints it broken up.
     * @param arr
     */
    public static void selectionSortPrinted(int[] arr) {
        //Iterate through entire array
        for (int i = 0; i < arr.length; i++) {
            //Print out currents
            System.out.println("Current Index: " + i);
            System.out.print("Current Array: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();

            //Print out what has been sorted
            System.out.print("Sorted part:   ");
            for (int j = 0; j < i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();

            //Print out what has not been sorted
            System.out.print("Unsorted part: ");
            for (int j = i; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();

            //Initialize and set a minimum index to first element of unsorted part
            int minIndex = i;

            //Iterate through unsorted array
            for (int j = i; j < arr.length; j++) {
                //Set minimum index to current index if minimum index's value is greater than current index's
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            System.out.println("Swapping index " + i + " with index " + minIndex);
            System.out.println();
            //make the swap if the minimum index changed using a temp
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
