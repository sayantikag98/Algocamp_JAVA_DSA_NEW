package L10_Intro_To_2DArrays.Homework;

public class Leetcode_766_ToeplitzMatrix {
    //https://leetcode.com/problems/toeplitz-matrix/
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        System.out.println(isToeplitzMatrix(matrix));
    }

    private static boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<m-1; j++){
                if(matrix[i][j] != matrix[i+1][j+1]) return false;
            }
        }
        return true;
    }
}
