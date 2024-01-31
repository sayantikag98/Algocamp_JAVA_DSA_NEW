package L9_ArrayList_Problem_Solving_1D_Arrays.Class;

import java.util.Arrays;

public class Leetcode_1480_RunningSumOf1dArray {
    //https://leetcode.com/problems/running-sum-of-1d-array/description/

    /*
    ***********PREFIX SUM**************
     */
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    private static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }
}
