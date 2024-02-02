package L10_Intro_To_2DArrays.Homework;

public class Leetcode_1672_RichestCustomerWealth {
    //https://leetcode.com/problems/richest-customer-wealth/description/
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }

    private static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] arr: accounts){
            int sum = 0;
            for(int val: arr){
                sum+=val;
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }
}
