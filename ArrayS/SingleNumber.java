package ArrayS;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr ={4,1,2,1,2};
        System.out.println(single(arr));
    }
    static int single(int[] arr){
        int res = 0;
        for(int num:arr){
            res ^= num;
        }
        return res;
    }
}
