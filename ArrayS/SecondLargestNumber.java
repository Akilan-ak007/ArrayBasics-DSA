package ArrayS;

public class SecondLargestNumber {
    /*
    Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.


Example 1

Input: nums = [8, 8, 7, 6, 5]

Output: 7

Explanation:

The largest value in nums is 8, the second largest is 7

Example 2

Input: nums = [10, 10, 10, 10, 10]

Output: -1

Explanation:

The only value in nums is 10, so there is no second largest value, thus -1 is returned
     */
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,9};
        System.out.println(larest(arr));
    }
    static int larest(int[] arr) {
        if(arr.length < 2) return -1;
        int max = arr[0];
        int secound = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];//max = 9
            }
        }
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] != max){
                if(secound == -1 || arr[i] > secound){
                    secound = arr[i];//secound element = 5
                }
            }
        }
        System.out.println("first large element "+max);
        System.out.print("second large element ");
        return secound;
    }
    }
