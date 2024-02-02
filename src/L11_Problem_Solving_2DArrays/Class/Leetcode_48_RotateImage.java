package L11_Problem_Solving_2DArrays.Class;

public class Leetcode_48_RotateImage {
    //https://leetcode.com/problems/rotate-image/description/
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        print(matrix);
    }

    private static void rotate(int[][] matrix) {

        //TC => O(n^2)
        //SC => O(1)
        int n = matrix.length;

        // clockwise rotation
        transpose(matrix, n);
        reverse(matrix, n);

        //for anti-clockwise rotation do reverse and then transpose
    }

    private static void transpose(int[][] matrix, int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void reverse(int[][] matrix, int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }

    private static void print(int[][] matrix){
        for(int[] arr: matrix){
            for(int val: arr){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
