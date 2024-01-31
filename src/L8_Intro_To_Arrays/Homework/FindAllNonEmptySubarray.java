package L8_Intro_To_Arrays.Homework;
import java.util.ArrayList;

public class FindAllNonEmptySubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        ArrayList<ArrayList<Integer>> ans = findAllNonEmptySubarray(arr);
        ans = findAllNonEmptySubarrayUsingRecursion1(arr, 0, 0, 0);
        print(ans);
    }

    private static void print(ArrayList<ArrayList<Integer>> ans){
        for(ArrayList<Integer> ele: ans){
            for(int val: ele){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }

    private static ArrayList<ArrayList<Integer>> findAllNonEmptySubarray(int[] arr){
        int n = arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                ArrayList<Integer> subarray = new ArrayList<>();
                for(int k = i; k<=j; k++){
                    subarray.add(arr[k]);
                }
                ans.add(subarray);
            }
        }
        return ans;
    }

    private static ArrayList<ArrayList<Integer>> findAllNonEmptySubarrayUsingRecursion(int[] arr, int i, int j){
        //i and j are controlling the starting and ending index of subarrays of arr
        if(i == arr.length) return new ArrayList<>();
        if(j == arr.length){
            return findAllNonEmptySubarrayUsingRecursion(arr, i+1, i+1);
        }
        ArrayList<ArrayList<Integer>> ans = findAllNonEmptySubarrayUsingRecursion(arr, i, j+1);
        ArrayList<Integer> ele = new ArrayList<>();
        for(int k = i; k<=j; k++){
            ele.add(arr[k]);
        }
        ans.add(ele);
        return ans;
    }

    private static ArrayList<ArrayList<Integer>> findAllNonEmptySubarrayUsingRecursion1(int[] arr, int i, int j, int k){
        //when i is out of bound then return empty list
        if(i == arr.length) return new ArrayList<>();
        //when j is out of bound then increment i and make j and k point to where i is
        if(j == arr.length) return findAllNonEmptySubarrayUsingRecursion1(arr, i+1, i+1, i+1);
        if(k == j+1) { //MADE MISTAKE HERE
            // when is k is out of bound then that sub-array is done and for the next sub-array add an empty list and then return
            ArrayList<ArrayList<Integer>> ans = findAllNonEmptySubarrayUsingRecursion1(arr, i, j+1, i);
            ans.add(new ArrayList<>()); //MADE MISTAKE HERE
            return ans;
        }
        ArrayList<ArrayList<Integer>> ans = findAllNonEmptySubarrayUsingRecursion1(arr, i, j, k+1);
        // for the current sub-array get the last list and add the current element at the start
        ans.getLast().addFirst(arr[k]);
        return ans;
    }
}
