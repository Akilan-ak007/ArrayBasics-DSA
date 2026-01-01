package ArrayS;

import java.util.Arrays;

public class RemoveDupilicateElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
    System.out.println("removed number : "+largest(arr));

//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

    }
    static int largest(int[] arr) {
        int k = 1;
        if(arr.length == 0) return 0;
        for(int i =1 ; i < arr.length ; i++){
            if(arr[i] != arr[i-1]){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}
