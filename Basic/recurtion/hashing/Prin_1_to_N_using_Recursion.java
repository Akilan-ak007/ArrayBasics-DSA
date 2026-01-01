package Basic.recurtion.hashing;
/*
Given an integer n, write a function to print all numbers from 1 to n (inclusive) using recursion.

You must not use any loops such as for, while, or do-while.
The function should print each number on a separate line, in increasing order from 1 to n.
Example 1
Input: n = 5
Output:
1
2
3
4
5
Example 2
Input: n = 1
Output:
1
 */

public class Prin_1_to_N_using_Recursion {
    static void fun(int n){
        if(n == 0){
            return;
        }
        fun(n-1);
        System.out.println(n);


    }
    public static void main(String[] args) {
        fun(5);
    }
}
