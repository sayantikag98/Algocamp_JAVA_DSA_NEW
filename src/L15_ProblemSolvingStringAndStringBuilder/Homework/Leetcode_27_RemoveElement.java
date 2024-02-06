package L15_ProblemSolvingStringAndStringBuilder.Homework;

public class Leetcode_27_RemoveElement {
    //https://leetcode.com/problems/remove-element/
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
        System.out.println(removeElementUsingTwoPointers(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    private static int removeElement(int[] nums, int val) {
        //TC => O(n)
        //SC => O(n)
        int countVal = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == val) countVal++;
            else nums[i-countVal] = nums[i];
        }
        return nums.length - countVal;
    }

    private static int removeElementUsingTwoPointers(int[] nums, int val){
        //TC => O(n)
        //SC => O(n)
        int i = 0, j = nums.length-1, countNonVal = 0;

        //here running the loop for i<=j is important MADE MISTAKE HERE
        //because if we run till i<j then it will fail for test case nums = [3] and val = 2
        while(i<=j){
            while(i<=j && nums[i]!=val){
                i++;
                countNonVal++;
            }
            while(i<=j && nums[j]==val){
                j--;
            }
            if(i<j){
                nums[i] = nums[j];
                nums[j] = val;
            }
        }
        return countNonVal;
    }
}
