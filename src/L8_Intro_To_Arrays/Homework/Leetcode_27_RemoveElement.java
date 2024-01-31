package L8_Intro_To_Arrays.Homework;

public class Leetcode_27_RemoveElement {
    //https://leetcode.com/problems/remove-element/
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int count = removeElement(nums, val);
        for(int ele: nums){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    private static int removeElement(int[] nums, int val) {
        int count = 0, i = 0, j = 0;
        while(j<nums.length){
            if(nums[j] != val) count++;
            if(nums[i] == val && nums[j] != val){
                nums[i] = nums[j];
                nums[j] = val;
            }
            if(nums[i] != val) i++;
            j++;
        }
        return count;
    }

    private static int removeElementAnotherApproach(int[] nums, int val){
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == val) count++;
            else nums[i-count] = nums[i];
        }
        return nums.length - count;
    }
}
