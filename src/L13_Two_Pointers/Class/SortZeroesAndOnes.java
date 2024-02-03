package L13_Two_Pointers.Class;
import java.util.Arrays;

public class SortZeroesAndOnes {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1};
        sortByCounting(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {0,1,1,0,1,1};
        sortBySorting(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {0,1,1,0,1,1};
        sortByTwoPointers(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    private static void sortByCounting(int[] arr){
        //Two pass
        int countZero = 0;
        for(int val: arr){
            if(val == 0) countZero++;
        }
        int idx = 0;
        while(countZero-->0){
            arr[idx++] = 0;
        }
        while(idx<arr.length){
            arr[idx++] = 1;
        }
    }

    private static void sortBySorting(int[] arr){
        Arrays.sort(arr);
    }

    private static void sortByTwoPointers(int[] arr){
        int i = 0, j = arr.length-1;
        while(i<j){
            if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
            }
            if(arr[i] == 0) i++;
            if(arr[j] == 1) j--;
        }
    }
}
