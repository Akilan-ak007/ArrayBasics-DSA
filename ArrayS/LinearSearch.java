package ArrayS;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,12};
        int target=12;
        System.out.println(linear(arr,target));
    }
    static int linear(int[] arr,int target){
        int n=arr.length;
        for(int i = 0; i <n ; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
