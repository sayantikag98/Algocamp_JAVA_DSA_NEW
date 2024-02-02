package L10_Intro_To_2DArrays.Class;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] mat1 = {{1,2,3}, {4,5,6}},
                mat2 = {{1,1}, {1,2}, {2,1}};

        print(matrixMultiplication(mat1, mat2));
    }

    private static int[][] matrixMultiplication(int[][] mat1, int[][] mat2){
        int row1 = mat1.length, row2 = mat2.length, col1 = mat1[0].length, col2 = mat2[0].length;

        if(col1 != row2){
            System.out.println("Matrix multiplication not possible");
            return new int[][]{{-1}};
        }

        int[][] res = new int[row1][col2];

        for(int i = 0; i<row1; i++){
            for(int j = 0; j<col2; j++){
                for(int k = 0; k<col1; k++){
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return res;
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
