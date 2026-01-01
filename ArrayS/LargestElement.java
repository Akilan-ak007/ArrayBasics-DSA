package ArrayS;

public class LargestElement {
    /*
    Given an array of integers nums, return the value of the largest element in the array


Example 1

Input: nums = [3, 3, 6, 1]

Output: 6

Explanation: The largest element in array is 6

Example 2

Input: nums = [3, 3, 0, 99, -40]

Output: 99

Explanation: The largest element in array is 99

     -------->time complex of O(n)<--------
     */
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,9};
        System.out.println(largest(arr));
    }
    static int largest(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
