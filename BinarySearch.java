// time complexity : O(log n)
/*
 * 
 * When to apply ? see sorted array ? Start with applying binary search
 */
public class BinarySearch {
    public static void main(String args[]){
        int[] arr= {-16,-12,-2,0,2,3,4,5,12,18,20};
        int target=12;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return index 

    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
           //int mid= (start+end)/2;
           //might be possible that (start+end) exceeds the range of int in java 
/*
 * s+(e-s)/2  -> (2s+e-s)/2   -> (s+e)/2
 */
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
    
}
