package ArrayS;

public class CheckIfArrayIsRoateAndShored {
    /*
    Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.


Example 1

Input : nums = [1, 2, 3, 4, 5]

Output : true

Explanation : For all i (1 <= i <= 4) it holds nums[i] <= nums[i+1], hence it is sorted and we return true.

Example 2

Input : nums = [1, 2, 1, 4, 5]

Output : false

Explanation : For i == 2 it does not hold nums[i] <= nums[i+1], hence it is not sorted and we return false.
     */
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println(largest(arr));
    }
    static boolean largest(int[] arr){
        int n =  arr.length;
        int count = 0;
        // count will store how many times the order breaks

        // Loop through the array
        for(int i = 0; i < n; i++){
            // Compare current element with next element
            // (i + 1) % n helps us compare last element with first
            if(arr[i] > arr[(i+1)%n]){
                count++;
                // Order breaks here
            }
        }
        // If order breaks more than once,
        // then array is NOT sorted and rotated
        if(count > 1){
            return false;

        }
        // If order breaks 0 or 1 time,
        // then array IS sorted and rotated
        return true;
        // A sorted and rotated array can have at most one place
// where the next element is smaller than the current one.

    }
}
