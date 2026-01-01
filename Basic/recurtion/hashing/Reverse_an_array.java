package Basic.recurtion.hashing;

import java.util.Arrays;

public class Reverse_an_array {
    /*
    Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.
Example 1
Input: n=5, arr = [1,2,3,4,5]
Output: [5,4,3,2,1]
Explanation: The reverse of the array [1,2,3,4,5] is [5,4,3,2,1]
Example 2
Input: n=6, arr = [1,2,1,1,5,1]
Output: [1,5,1,1,2,1]

Explanation: The reverse of the array [1,2,1,1,5,1] is [1,5,1,1,2,1].
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr, int i ){
        int n = arr.length;
        // n / 2 will splite the array into two
        if( i >= n/2){
            return ;
        }
        int temp = arr[i];
        arr[i] = arr[n - i- 1];
        arr[n - i - 1] = temp;

        reverse(arr,i+1);
    }
}
