package ArrayS;

public class CheckIfArraySorted {
    static boolean checkIfArraysorted(int[] arr){
        int n= arr.length;
        for(int i=1;i<n;i++){
            if ( arr[i-1] < arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(checkIfArraysorted(arr));
    }
}
