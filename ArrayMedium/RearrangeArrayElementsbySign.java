package ArrayMedium;

import java.util.Arrays;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};

        int[] result = rearrangeArray(arr);   // method call
        System.out.println(Arrays.toString(result)); // print result
    }

    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int positiveIndex = 0;
        int negativeIndex = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result[positiveIndex] = nums[i];
                positiveIndex += 2;
            } else {
                result[negativeIndex] = nums[i];
                negativeIndex += 2;
            }
        }
        return result;
    }
}
