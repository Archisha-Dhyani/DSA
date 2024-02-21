/*
 * Best case O(1)
 * Worst case O(n)
 */


import java.util.Scanner;

class LinearSearch {
    int linear_search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i; // If element is found, return its index
        }
        return -1; // If element is not found, return -1
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Sample array
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        System.out.println("Enter the element to search:");
        int key = scanner.nextInt();

        LinearSearch search = new LinearSearch();
        int index = search.linear_search(arr, key);

        if (index != -1)
            System.out.println("Element " + key + " found at index " + index);
        else
            System.out.println("Element " + key + " not found in the array");
        
        scanner.close();
    }
}
