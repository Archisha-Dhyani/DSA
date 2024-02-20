 /*
* Array objects are in heap , heap memory is not continuous 
* hence arrays might not be continuous in java , depends on JVM 
* 
*/
// Array List in Java
public class BasicArray {

   // Function to print array elements
   public static void printArray(int[] arr) {
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
       System.out.println();
   }

   // Function to find maximum element in array
   public static int findMax(int[] arr) {
       int max = arr[0];
       for (int i = 1; i < arr.length; i++) {
           if (arr[i] > max) {
               max = arr[i];
           }
       }
       return max;
   }

   // Function to find minimum element in array
   public static int findMin(int[] arr) {
       int min = arr[0];
       for (int i = 1; i < arr.length; i++) {
           if (arr[i] < min) {
               min = arr[i];
           }
       }
       return min;
   }

   // Function to calculate sum of array elements
   public static int calculateSum(int[] arr) {
       int sum = 0;
       for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
       }
       return sum;
   }

   // Main method to test the above functions
   public static void main(String[] args) {
       int[] arr = {5, 3, 8, 1, 2, 9, 4, 7, 6};

       System.out.print("Original array: ");
       printArray(arr);

       System.out.println("Maximum element: " + findMax(arr));
       System.out.println("Minimum element: " + findMin(arr));
       System.out.println("Sum of elements: " + calculateSum(arr));
   }
}
