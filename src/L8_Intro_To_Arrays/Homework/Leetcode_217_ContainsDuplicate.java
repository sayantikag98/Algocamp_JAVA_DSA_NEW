package L8_Intro_To_Arrays.Homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Leetcode_217_ContainsDuplicate {
    //https://leetcode.com/problems/contains-duplicate/description/
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
    }

    private static boolean containsDuplicateUsingNestedLoops(int[] nums){
        //TC => O(n^2)
        //SC => O(1)
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    private static boolean containsDuplicateUsingSorting(int[] nums){
        //TC => O(nlogn)
        //SC => O(1)
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }

    private static boolean containsDuplicateUsingHashMap(int[] nums){
        //TC => O(n)
        //SC => O(n)
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for(int val: nums){
            if(hm.containsKey(val)) return true;
            hm.put(val, true);
        }
        return false;
    }

    private static boolean containsDuplicateUsingHashSet(int[] nums){
        //TC => O(n)
        //SC => O(n)
        HashSet<Integer> hm = new HashSet<>();
        for(int val: nums){
            if(hm.contains(val)) return true;
            hm.add(val);
        }
        return false;
    }
}
