/*
 * LEETCODE 
 * 34. Find First and Last Position of Element in Sorted Array

 */

public class StartEndPos {
    public static int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int m=search(nums,target,true);
        
        int n=search(nums,target,false);
        ans[0]=m;
        ans[1]=n;
        return ans;
    
        }
        //return index value of target 
        static int  search(int[] nums, int target, boolean findStartIndex){
            int ans=-1;
            int start=0;
            int end=nums.length-1;
            while(start<=end){
               int mid=start+(end-start)/2;
               if(target<nums[mid]){
                end=mid-1;
               }
               else if(target>nums[mid]){
                start=mid+1;
               }
               else{
                   //possible answer 
                ans = mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
               }
            }
            return ans;
    
        }
        public static void main(String[] args) {
            int[] nums = {5,7,7,8,8,10};
            int target = 8;
            int [] arr= searchRange(nums,target);
            System.out.println("[" + arr[0] + ", " + arr[1] + "]");


        }
    
}
