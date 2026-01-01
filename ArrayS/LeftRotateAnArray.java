package ArrayS;

import java.util.Arrays;

public class LeftRotateAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Noraml array : "+Arrays.toString(arr));
        left(arr);
        System.out.println("left rotate array : "+Arrays.toString(arr));
    }
    static int left (int[] arr){
        int temp = arr[0];
        int n = arr.length;
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];

        }
        arr[n-1] = temp;
        return temp;
    }
}
