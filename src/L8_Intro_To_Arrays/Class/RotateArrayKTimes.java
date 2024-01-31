package L8_Intro_To_Arrays.Class;

public class RotateArrayKTimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
//        System.out.println(-9%5); //-4
//        System.out.println(9%5); //4
        rotateArray(arr, k);
        print(arr);
        rotateArrayByReverse(arr, k);
        print(arr);
    }

    private static void rotateArrayByReverse(int[] arr, int k){
        //TC => O(n)
        //SC => O(1)

        /*
         k = -22
         k = k%n = -22%5 = -2
         k<0 => k = k+n = -2+5 = 3
         */
        k%=arr.length;
        if(k<0) k+=arr.length;
        reverseArrayInParts(arr, 0, arr.length-1);
        reverseArrayInParts(arr, 0, k-1);
        reverseArrayInParts(arr, k, arr.length-1);
    }

    private static void reverseArrayInParts(int[] arr, int start, int end){
        //reverse arr from index i to index j
        if(start<0 || end<0 || start>=arr.length || end>=arr.length) return;
        int i = start, j = end;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    private static void rotateArray(int[] arr, int k){
        //TC => O(nk)
        //SC => O(1)
        k%=arr.length;
        if(k<0) k+=arr.length;
        while(k-->0){
            int temp = arr[arr.length-1];
            //shifting to the right -> traverse array from end
            //shifting to the left -> traverse array from start
            for(int i = arr.length - 1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }
    }

    private static void print(int[] arr){
        for(int val: arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
