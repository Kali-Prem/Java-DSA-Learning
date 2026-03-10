/* 
leetcode 258
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

*/

//===solve using recusion===========

import java.util.Scanner;
class Leetcode_258 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //38
        System.out.print(reduceTosingle(n));
    }
    public static int reduceTosingle(int n) { //n = 38;
        if(n <= 9){
            return n;
        }
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n /10;
        }
        return reduceTosingle(sum); // 2
        
    }
}


//============Another APPROACH=========
/*
class Solution {
    public int addDigits(int num) {
        //approaches --> hashset, recursion
        while(num >= 10){
            int sum = 0;
            while(num != 0){
                int rem = num % 10;
                sum =sum + rem;
                num = num / 10;
            }
            num = sum;
        }
        return num;
        
    }
}
*/