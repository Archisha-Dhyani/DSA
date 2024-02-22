/*
 * 
 * ceiling number: the smallest number that is greater than or equal to 
 * the target value
 * Floor Number : the greatest number that is smaller that or equal to 
 * the target value
 * 
 * Entire code is same as binaru search except instead of returning -1, 
 * we return start(ceiling), end(floor)
 */

public class CeilingFloorBS {
    public static void main(String[] args) {
        int[] arr= {-16,-12,-2,0,2,3,4,5,12,18,20};
        int target=11;
        int ans = ceilingNumber(arr, target);
        System.out.println("Ceiling NUmber : "+ans);
        int floors=floorNumber (arr,target);
        System.err.println("Floor Number" +floors);
        
    }
    static int ceilingNumber(int[] arr,int target){
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
           /*
            * here once the loop breaks , the condition will be violated, here target element is not found 
             then the celing value will be start, bacause (start>end)and ts value will be the smallest 
             value that is greater than target
            */
           
           return start;
        }
        static int floorNumber(int[] arr,int target){
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

               
               return end;
            }
    

    }

