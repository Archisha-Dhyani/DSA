import java.util.*;

public class RotationCount {
    static int find(int[] arr){
        int start=0;
        int end =arr.length-1;
        while (end>=start){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;

            }
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr= {5,6,7,0,1,2};
        int pivot=find(arr);
        System.out.println(pivot+1);


    }
}
