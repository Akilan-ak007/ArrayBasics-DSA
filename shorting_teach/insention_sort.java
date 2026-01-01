package shorting_teach;

public class insention_sort {
    public static void main(String[] args) {
        int[] arr = {32, -43, -4, 0, 75};
        int n = arr.length;
        for (int i = 0; i <= n - 1;i++){
            int j = i;
            while( j > 0 && arr[j-1] > arr[j] ){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                i--;
            }
        }
        for(int display : arr){
            System.out.print(display + " ");
        }
    }
}
