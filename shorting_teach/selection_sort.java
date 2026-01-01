package shorting_teach;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int [] arr = {5,23,-12,3,4,0};
        int n = arr.length;
        for(int i = 0 ;i <= n-1;i++){
            int min = i;

            for(int j = i;j <= n-1;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
//        for(int display : arr){
//            System.out.print(display + " ");
//        }
        System.out.println(Arrays.toString(arr));














    }
//        int[] arr = {4,5,3,2,1};
//        selection(arr);
//        System.out.println(Arrays.toString(arr));
//
//    }
//    static void selection(int[] arr) {
//        for( int i = 0; i < arr.length; i++){
//            int last = arr.length - i - 1;
//            int max = maxvalue(arr,0,last);
//            swap(arr,max,last);
//        }
//    }
//    static void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//    static int maxvalue(int[] arr , int start , int end){
//        int max = start;
//        for(int i = start; i<=end ; i++ ){
//            if(arr[max] < arr[i]){
//                max = i;
//            }
//        }
//        return max;
//    }
}
