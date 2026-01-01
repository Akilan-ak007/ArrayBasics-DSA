package ArrayMedium;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int chick = nums[0];
        for(int num : nums){
            if(count == 0){
                chick = num;
            }
            if(chick == num){
                count++;
            }
            else{
                count--;
            }
        }
        return chick;
    }
}
