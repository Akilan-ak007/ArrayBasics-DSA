package ArrayMedium;

import java.util.HashSet;

public class longestConseutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
    static public int longestConsecutive(int[] nums) {
        //creating a HashSet
        HashSet<Integer> set = new HashSet<>();
        //take a copy of array in set through this loop
        for(int num : nums){
            set.add(num);
        }
        //keep longest as 0 at start
        int longest = 0;
        //check for Sequence all throught the set
        for(int num : nums){
            if(!set.contains(num-1)){  //Start counting only if num is the start of a sequence eg: start at 1 means it what 0 , 2 means start at 1
                int currentnum = num;//this is a current sequence
                int count = 1;//takes the count

                while(set.contains(currentnum+1)){//add the sequence if is fails
                    currentnum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

}
