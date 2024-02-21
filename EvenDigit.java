/*
 * This is a leetcode problem 
 * 
 * 
 * 
 */




public class EvenDigit {
    public static int findNumbers(int[] nums) {
        int counter=0;
        for (int i=0;i<nums.length;i++){
            int c=0;
            int n=nums[i];
            while(n>0){
                
                c++;
                n=n/10;
                }
            if(c%2==0)
            {
                counter++;
            }
        }
        return counter;
    }
    //another method 
    static int digits2(int[] nums){
        int counter=0;
        for (int i=0;i<nums.length;i++){
            // to count number of digits 
            int count=(int)(Math.log10(nums[i]))+1;
            if(count%2==0)
            counter++;
        }
        return counter;
    }
    public static void main(String args []){
        int arr[]={10,3,4,56,8,90};
        System.out.println(findNumbers(arr));
        System.out.println(digits2(arr));

    }
}
