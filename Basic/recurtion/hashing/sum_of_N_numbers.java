package Basic.recurtion.hashing;

public interface sum_of_N_numbers {
    /*
    Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.


Example 1

Input : N = 4

Output : 10

Explanation : first four natural numbers are 1, 2, 3, 4.

Sum is 1 + 2 + 3 + 4 => 10.

Example 2

Input : N = 2

Output : 3

Explanation : first two natural numbers are 1, 2.

Sum is 1 + 2 => 3.
     */
    public static void main(String[] args) {
        System.out.println(fun(2));

    }

    static int fun(int n) {
        int sum = 0;
        if( n == 0 ){
            return 0;
        }
        return fun(n-1) + n;

        //first fun(n-1) will be calculate untile the if statement is false
        //after if statement is false it will return in backwise calculating like
        //n = 2 ----> fun(n - 1) ---> fun(2-1)->1--->fun(1-1>-->0
        //if(0 == 0 )---> it will return like first 2 and 1 give ---> output:3 !

    }
}
