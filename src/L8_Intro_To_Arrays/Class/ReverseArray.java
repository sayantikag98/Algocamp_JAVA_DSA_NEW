package L8_Intro_To_Arrays.Class;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        print(arr);
        reverse(arr);
        print(arr);
    }

    private static void reverse(int[] arr){
        int i = 0, j = arr.length - 1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    private static void print(int[] arr){
        for(int val: arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
