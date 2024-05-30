/*
 * LEETCODE 1095. Find in Mountain Array
 * 
 * 1. find peak elemet 
 * 2. binary search in first half
 *  3. if not found , search in second half (order agnostic bs)
 *
 */

public class FindMountain {
    static int binarySearch(int[] arr,int target,int start,int end){

        while(start<=end){
        int mid=start+(end-start)/2;
           if(target<arr[mid]){
            end=mid-1;
           }
           else if(target>arr[mid]){
            start=mid+1;
           }
           else{
            return mid;
           }
        }
        return -1;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end){


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
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){

           int mid=start+(end-start)/2;
           if(arr[mid]>arr[mid+1]){
            // this may be the wnswer , thats why end!=mid-1
            end=mid;
           }
           else{
            
            start=mid+1;
           }
          
        }
        return start;
    }

    static int findInMountainArray(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr,target,0,peak);
        if ( firstTry != -1){
            return firstTry;
        }
        else{
            return orderAgnosticBS(arr, target, peak+1, arr.length-1);
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,3,1};
        int target=3;
        int ans = findInMountainArray(arr, target);
        System.out.println(ans);
      

    }


}
