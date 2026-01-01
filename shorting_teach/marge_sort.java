package shorting_teach;

import java.util.Arrays;

//------>merge sort<-------

public class marge_sort {
    public static void main(String[] args) {
        int[] arr = {12,34,456,5,44};
        arr=margeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] margeSort(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int mid =  arr.length/2;
        int[] left = margeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = margeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return marge(left, right);
    }

    private static int[] marge(int[] fisr, int[] secoend) {
        int[] mix = new int[fisr.length+secoend.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i <fisr.length&&j<secoend.length) {
            if (fisr[i] < secoend[j]) {
                mix[k] = fisr[i];
                i++;
            } else {
                mix[k] = secoend[j];
                j++;
            }
            k++;
        }
            while(i < fisr.length){
                mix[k] = fisr[i];
                i++;
                k++;
            }
            while(j <secoend.length){
                mix[k] = secoend[j];
                j++;
                k++;
            }
        return mix;
        }
    }
