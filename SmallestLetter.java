/*
 * LEETCODE: 744. Find Smallest Letter Greater Than Target
 * same logic as ceiling of a number
 *
 */


public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target= 'a';
        System.out.println(nextGreatestLetter(letters,target));
        
    }
    static public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
           
           int mid=start+(end-start)/2;
           if(target<letters[mid]){
            end=mid-1;
           }
           else {
            start=mid+1;
           }
        }

        // adding mod incase start= length of the array , it will return 0(condition in question)
        return letters[start%letters.length];
    }
    }
    

