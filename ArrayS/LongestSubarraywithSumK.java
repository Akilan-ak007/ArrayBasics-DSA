package ArrayS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubarraywithSumK {
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, -10};
        int k = 15;

        System.out.println(longest(arr, k));
    }
    static  int longest(int[] arr , int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;//the result
        int prefixsum = 0;//to store the prefixSum
        for (int i = 0; i < arr.length; i++) {
            prefixsum += arr[i];//arr[i] array will be in the prefixsum to calculate

            if(prefixsum == k){
                res = i+1;// prefixeSum is equal to K till will increse (eg: prefixsum is 15 and K is also 15 the count will in crese
            }
            if(map.containsKey(prefixsum - k)){//to calculate the prefixsum
                res = Math.max(res, i - map.get(prefixsum - k));
            }
            if(!map.containsKey(prefixsum)){// it is not it will replace it
                map.put(prefixsum,1);
            }
        }
        return res;
    }
}
