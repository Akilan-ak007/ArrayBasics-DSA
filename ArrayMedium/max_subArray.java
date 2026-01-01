package ArrayMedium;

import java.util.Arrays;

public class max_subArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray2(arr));
    }
    //brutefource approse
    static int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        for (int st = 0; st < n; st++) {
            int currentSum = 0;
            for (int end = st + 1; end < n; end++) {
                currentSum += arr[end];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
        //time complex : O(n^2)
    }
    //optimal solution
    //kadane's algorithm
    static int maxSubArray2(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;//it will like 0
        int currentsum = 0;//current will be in 0
        for(int val : arr){
            currentsum += val;// val array value will be in a currensum
            maxSum = Math.max(currentsum, maxSum);//maxsum will be the maxsum of subarray Eg: maxSum = Math.max(7, 5); // result = 7

            if(currentsum < 0){
                currentsum = 0;//when it is -negative it is zero
            }
        }
        return maxSum;
        //time complex : O(n)
    }
}
