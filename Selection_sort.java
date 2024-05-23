
// time complexity : O(n^2)
public class Selection_sort {
    public static void selectionSort(int[] arr) {
        int n = arr.length; // Length of the array

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the current index is the minimum

            // Find the index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; //minIndex=4
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex]; // 1
            arr[minIndex] = arr[i];  //8
            arr[i] = temp;  // 1
        }
    }

    // Main method to test the selection sort algorithm
    public static void main(String[] args) {
        int[] arr = {8,4,6,9,2,3,1}; 
        selectionSort(arr); 
        System.out.println("Sorted array:"); 
        for (int num : arr) { 
            System.out.print(num + " ");
        }
    }
}





/*
 #include <stdio.h>

// Function to perform selection sort
void selectionSort(int arr[], int n) {
    // Traverse through all array elements
    for (int i = 0; i < n - 1; i++) {
        int minIndex = i; // Assume the current index is the minimum

        // Find the index of the minimum element in the unsorted part of the array
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        // Swap the found minimum element with the first element
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}

// Main function to test the selection sort algorithm
int main() {
    int arr[] = {64, 25, 12, 22, 11};
    int n = sizeof(arr) / sizeof(arr[0]); // Calculate the length of the array
    selectionSort(arr, n);
    printf("Sorted array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    return 0;
}

 */
