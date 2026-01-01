package ArrayS;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        int n = arr.length;
        int count = 0;
        int maxcount = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1){
                count++;

                if(count > maxcount){
                    maxcount = count;
                }
            }
            else count = 0;
        }
        System.out.println(maxcount);
    }
}
