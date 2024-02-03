package L13_Two_Pointers.Class;

public class Leetcode_167_TwoSumIIInputArrayIsSorted {
    //https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(numbers, target);
        System.out.println(ans[0]+" "+ans[1]);
    }

    private static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        while(i<j){
            if(numbers[i] + numbers[j] == target) return new int[]{i+1, j+1};
            if(numbers[i] + numbers[j] < target) i++;
            if(i<j && numbers[i] + numbers[j] > target) j--;
        }
        return new int[]{-1, -1};
    }
}
