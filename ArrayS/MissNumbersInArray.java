package ArrayS;

import java.util.Arrays;

public class MissNumbersInArray {
    public static void main(String[] args) {
        int[] nums =  {9,6,4,2,3,5,7,0,1};
        int n =  nums.length;
        int total = n*(n+1)/2;
        int miss = 0;
        for(int num : nums){
            miss += num;
        }
        System.out.println(Arrays.toString(nums));
        System.out.print("missing number on the array is : ");
        System.out.println(total - miss);
    }
}
