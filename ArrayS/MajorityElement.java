package ArrayS;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,4,4};
        System.out.println(majority(nums));
    }
    static int majority(int[] nums){
        int merror = nums[1];
        int count = 0;
        for(int num:nums){
            if(count == 0){
                merror = num;
            }
            if(num == merror){
                count++;
            }
            else{
                count--;
            }
        }return merror;
    }
}
