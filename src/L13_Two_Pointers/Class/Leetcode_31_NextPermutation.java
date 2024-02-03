package L13_Two_Pointers.Class;
import java.util.Arrays;

public class Leetcode_31_NextPermutation {
    //https://leetcode.com/problems/next-permutation/description/
    public static void main(String[] args) {
        int[] nums = {6,7,5};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void nextPermutation(int[] nums) {

        //TC => O(n)
        //SC => O(1)
        /*
        1. start traversing the given array from the end of the array and find the first element (firstSmaller) from the end
            which is strictly smaller than the next element
        2. if no such element exists then the array is sorted in decreasing order, then no next permutation is possible
            so sort in ascending order and return (if this step is not done then try to check whether firstSmaller exists
            or not in step 3 and if it doesn't exist skip step 3 and proceed to step 4)
        3. try to search in the region next to the smaller element (firstSmaller) found in step 1 till the end of the array, an element
            which is strictly greater than that smaller element. Because this region is sorted in decreasing order so
            start traversing from the end and find out the next greater element and swap it with the smaller element (firstSmaller)
            found in step 1.
        4. reverse the region from next to the smaller element (firstSmaller) till the end of the array to sort it in ascending order
         */
        int n = nums.length, greaterElementIdx = -1;

        //find the index of the element which is strictly smaller than the next element starting from the end of the array
        for(int i = n-1; i>0; i--){
            if(nums[i-1]<nums[i]){
                greaterElementIdx = i-1;
                break;
            }
        }

        //find the element in the nums array from greaterElementIdx+1 till the end which is strictly greater than nums[greaterElementIdx]
        //as the region greaterElementIdx+1 till the end of the array is sorted in decreasing order so to find the next greater element
        //of nums[greaterElementIdx] we have to start traversing the array from the end till greaterElementIdx
        //once next greater element is found just swap it with nums[greaterElementIdx]

        //one imp check greaterElementIdx != -1 because if it is then the array is already sorted in decreasing order then skip this loop and sort directly

        for(int i = n-1; i>greaterElementIdx && greaterElementIdx!=-1; i--){
            if(nums[greaterElementIdx] < nums[i]){
                swap(nums, greaterElementIdx, i);
                break;
            }
        }

        //sort the part of the array from greaterElementIdx till the end or reverse this part
        //reverse[greaterElementIdx+1, n-1] or sort[greaterElementIdx+1, n-1] both works
        //reverse works because it will be sorted in descending order, and we have to sort it in ascending order
        //sort might increase the time complexity to O(nlogn)

        reverse(nums, greaterElementIdx+1, n-1);
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
