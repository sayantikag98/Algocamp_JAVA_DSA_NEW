package L11_Problem_Solving_2DArrays.Homework;

public class Leetcode_566_ReshapeTheMatrix {
    //https://leetcode.com/problems/reshape-the-matrix/
    public static void main(String[] args) {
        int[][] matrix = {{1,2},{3,4}};
        int r = 1, c = 4;
        print(matrixReshape(matrix, r, c));
    }

    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length, m = mat[0].length;
        if(m*n != r*c) return mat;
        int[][] ans = new int [r][c];
        int row = 0, col = 0;
        for(int[] arr: mat){
            for(int val: arr){
                if(col==c){
                    row++;
                    col=0;
                }
                ans[row][col] = val;
                col++;
            }
        }
        return ans;
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
