package L8_Intro_To_Arrays.Homework;

import java.util.Arrays;

public class Leetcode_1929_ConcatenationOfArray {
    //https://leetcode.com/problems/concatenation-of-array/description/
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    private static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i<n; i++){
            ans[i] = nums[i];
            ans[n+i] = nums[i];
        }
        return ans;
    }
}
