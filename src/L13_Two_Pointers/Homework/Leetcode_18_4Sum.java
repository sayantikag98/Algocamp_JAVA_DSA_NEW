package L13_Two_Pointers.Homework;
import java.util.ArrayList;
import java.util.List;

public class Leetcode_18_4Sum {
    //https://leetcode.com/problems/4sum/description/
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        print(fourSum(nums, target));
    }

    private static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        if(n<4) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<=n-4; i++){
            for(int j = i+1; j<=n-3; j++){
                for(int k = j+1; k<=n-2; k++){
                    for(int l = k+1; l<=n-1; l++){
                        if(nums[i]+nums[j]+nums[k]+nums[l] == target){
                            List<Integer> arr = new ArrayList<>();
                            arr.add(nums[i]);
                            arr.add(nums[j]);
                            arr.add(nums[k]);
                            arr.add(nums[l]);
                            if(!ans.contains(arr))
                                ans.add(arr);
                        }
                    }
                }
            }
        }
        return ans;
    }

    private static void print(List<List<Integer>> ans){
        for(List<Integer> l: ans){
            for(int val: l){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
