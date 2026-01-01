package shorting_teach;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int [] arr = {5,23,-12,3,4,0};
        int n = arr.length;
        for(int i = 0 ;i < n-1;i++){
            for(int j = 0 ;j < n-i-1;j++){
                if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
//        for(int display : arr){
//            System.out.print(display + " ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}
