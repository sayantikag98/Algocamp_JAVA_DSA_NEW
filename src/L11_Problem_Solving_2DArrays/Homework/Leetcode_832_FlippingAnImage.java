package L11_Problem_Solving_2DArrays.Homework;

public class Leetcode_832_FlippingAnImage {
    //https://leetcode.com/problems/flipping-an-image/description/
    public static void main(String[] args) {
        int[][] matrix = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        print(flipAndInvertImage(matrix));
    }

    private static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length, m = image[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][n-1-j];
                image[i][n-1-j] = temp;
                image[i][j]^=1;
                image[i][n-1-j]^=1;
            }
            if((m&1)==1){
                image[i][m/2]^=1;
            }
        }
        return image;
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
