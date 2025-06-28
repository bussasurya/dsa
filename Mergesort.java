public class Mergesort {

    // Recursively divides the array
    public static void divide(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        // Recursively divide the left and right parts
        divide(arr, left, mid);
        divide(arr, mid + 1, right);

        // Merge the divided parts
        conquer(arr, left, mid, right);
    }

    // Merges two sorted halves
    public static void conquer(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy values into temporary arrays
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge the temporary arrays back into the main array
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left array
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of right array
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Prints the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main function to test
    public static void main(String[] args) {
        int[] array = { 12, 5, 8, 3, 7, 1, 6 };

        System.out.println("Original array:");
        printArray(array);

        divide(array, 0, array.length - 1);  // Sort the array

        System.out.println("Sorted array:");
        printArray(array);
    }
}
