package L9_ArrayList_Problem_Solving_1D_Arrays.Class;
import java.util.ArrayList;
import java.util.Collections;

public class AddTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {5,6,7}, arr2 = {3,4,4,6};
        System.out.println(addTwoArrays(arr1, arr2));
    }

    public static ArrayList<Integer> addTwoArrays(int[] arr1, int[] arr2){
        int carry = 0, i = arr1.length-1, j = arr2.length-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0) sum += arr1[i--];
            if(j>=0) sum += arr2[j--];
            ans.add(sum%10);
            carry = sum/10;
        }
        if(carry>0) ans.add(carry);
        Collections.reverse(ans);
        return ans;
    }
}
