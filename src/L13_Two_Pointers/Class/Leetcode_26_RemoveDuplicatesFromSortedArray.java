package L13_Two_Pointers.Class;

public class Leetcode_26_RemoveDuplicatesFromSortedArray {
    //https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int i = 1;
        for(int j = 1; j<nums.length; j++){
            if(nums[j-1]<nums[j]){
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
