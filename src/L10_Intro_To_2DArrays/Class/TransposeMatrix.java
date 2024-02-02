package L10_Intro_To_2DArrays.Class;

public class TransposeMatrix {
    //https://leetcode.com/problems/transpose-matrix/
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        print(transposeMatrix(arr));
        print(transposeSquareMatrix(arr));
    }

    private static int[][] transposeMatrix(int[][] arr){
        int n = arr.length, m = arr[0].length;
        int[][] transpose = new int[m][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;
    }

    private static int[][] transposeSquareMatrix(int[][] arr){
        //will work only for square matrix
        int n = arr.length, m = arr[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    private static void print(int[][] transpose){
        for(int[] arr: transpose){
            for(int val: arr){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
