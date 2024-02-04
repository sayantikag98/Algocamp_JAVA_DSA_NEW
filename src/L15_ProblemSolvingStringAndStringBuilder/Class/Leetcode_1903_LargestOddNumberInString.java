package L15_ProblemSolvingStringAndStringBuilder.Class;

public class Leetcode_1903_LargestOddNumberInString {
    //https://leetcode.com/problems/largest-odd-number-in-string/description/
    public static void main(String[] args) {
        System.out.println(largestOddNumber("4206"));
    }

    private static String largestOddNumber(String num) {
        /*
        1. any number which is odd will have its last digit as odd
           and any number which is even will have its last digit as even
        2. if the digit as a character is odd then its unicode is also odd
           and if its even then its unicode is also even
        eg:
            ch = '3'
            unicode of ch - '0' = 51 which is odd

            ch = '2'
            unicode of ch - '0' = 50 which is even
         */

        /*
        (num.charAt(i) & 1) == 1 => this expression is checking whether the least significant bit
        of the binary representation of the character at position i in the string num is 1 or not.
        If true, it indicates that the character is an odd number in terms of its ASCII or Unicode value.
         */

        for(int i = num.length()-1; i>=0; i--){
            if((num.charAt(i) & 1) == 1) return num.substring(0, i+1);
        }
        return "";
    }
}
