/*
 * Here we dont know the order (ascending or descending) in which the 
 * array is sorted.
 */

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr= {-16,-12,-2,0,2,3,4,5,12,18,20};
        int target=12;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
        int[] arr2= {15,12,9,2,0,-3,-5};
        System.out.println(orderAgnosticBS(arr2, 2));

    }
    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        // find the order of sorted array
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
           int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                   }
                   else {
                    start=mid+1;
                   }

            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                   }
                   else {
                    start=mid+1;
                   }
            }
           }
           return -1;
        }
        
    }
    
