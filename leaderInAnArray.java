package ArrayMedium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leaderInAnArray {

    public static void main(String[] args) {
        System.out.println("Program started");

        int[] nums = {2, 3, 7, 9, 1};
        //create a Object of the class  .  Needed because leaders() is not static.
        leaderInAnArray obj = new leaderInAnArray();
        //Calls the leaders() method using the object.
        //
        //Passes nums array as input.
        //
        //Stores the returned leader elements in a list.
        List<Integer> leaders = obj.leaders(nums);

        System.out.println(leaders);
    }


    public List<Integer> leaders(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int max = nums[n-1]; // start from rightmost
        result.add(max);

        // rightmost element is always a leader
        for (int i = n-2; i >= 0; i--) {
            if (nums[i] > max) {
                result.add(nums[i]);
                max = nums[i];
            }
        }

        Collections.reverse(result);
        return result;
    }
}
