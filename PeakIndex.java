/*
 * LEETCODE 852. Peak Index in a Mountain Array
 * Basically, greatest elemet in the array 
 * 
 */

public class PeakIndex {
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
    public static void main(String[] args) {
        int[] arr={0,10,15,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    
}
