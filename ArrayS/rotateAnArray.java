package ArrayS;

import java.util.Arrays;

public class rotateAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr, int k) {
      int n =  arr.length;
      k = k % n;
      //shift all the array
      reverse (arr,0,n-1);
      //shift until the k given example k = 3 shift 3
      reverse(arr, 0, k - 1);
      //now put the remaining value to array
      reverse(arr, k, n - 1);
    }
    static void reverse(int[] arr, int start, int end) {
        //shift the start to the end
        //all shifting in this code
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}