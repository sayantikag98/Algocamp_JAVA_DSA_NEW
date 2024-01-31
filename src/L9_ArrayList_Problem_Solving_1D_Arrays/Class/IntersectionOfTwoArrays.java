package L9_ArrayList_Problem_Solving_1D_Arrays.Class;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {10, 19, 20, 30, 40, 40, 40, 50},
                arr2 = {15, 16,17,18, 20, 25, 30, 30, 40};

        System.out.println(intersectionArray(arr1, arr2));
    }

    private static ArrayList<Integer> intersectionArray(int[] arr1, int[] arr2){
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return ans;
    }
}
