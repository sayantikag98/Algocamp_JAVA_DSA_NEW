package L11_Problem_Solving_2DArrays.Class;

public class Leetcode_73_SetMatrixZeroes {
    //https://leetcode.com/problems/set-matrix-zeroes/description/
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        print(matrix);
        setZeroesSimplerConstantSpaceApproach(matrix);
        System.out.println("__________________");
        print(matrix);
    }

    private static void setZeroesSimplerConstantSpaceApproach(int[][] matrix){
        //TC => O(n*m)
        //SC => O(1)
        int rows = matrix.length, cols = matrix[0].length;
        /*
        isFirstRowZero is the marker for making the first row as zero
        isFirstColZero is the marker for making the first column as zero
         */
        boolean isFirstRowZero = false, isFirstColZero = false;

        /*
        traverse through the entire matrix mark the first row and first column separately
        and in the rest of the matrix if any cell is zero then mark the first row and the first column of that corresponding cell as zero
         */
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(matrix[i][j] == 0){
                    if(i==0) isFirstRowZero = true;
                    if(j==0) isFirstColZero = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //except for the first row and the first column traverse through the rest of the matrix
        // and check in the first row which column is supposed to be marked as zero
        // and check in the first column which row is supposed to be marked as zero

        for(int i = 1; i<rows; i++){
            for(int j = 1; j<cols; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        //if first row is set to be zero then set it as zero

        if(isFirstRowZero){
            for(int j = 0; j<cols; j++){
                matrix[0][j] = 0;
            }
        }

        //if first col is set to be zero then set it as zero

        if(isFirstColZero){
            for(int i = 0; i<rows; i++){
                matrix[i][0] = 0;
            }
        }
    }

    private static void setZeroesAnotherApproach(int[][] matrix){
        //TC => O(n*m)
        //SC => O(1)
        int rows = matrix.length, cols = matrix[0].length;
        /*
        iterate through the whole matrix whichever cell of the matrix is zero set the first column
        and the first row of that corresponding cell as zero
        eg: if matrix[2][3] is 0 then matrix[2][0] and matrix[0][3] should be set as zero which will
        act as a marker to later on make the entire 2nd row and 3rd column as zero

        Note: matrix[0][0] marked as zero will represent that the 0th row should be made zero
        and the boolean isFirstColumnZero would be the marker for making the first column as zero
         */
        boolean isFirstColumnZero = false;
        for(int i = 0; i<rows; i++){
            if(matrix[i][0] == 0) isFirstColumnZero = true;
            for(int j = 1; j<cols; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        /*
        here backward iteration of the matrix is important because if started from forward direction
        will set the first column and first row as zero but those rows and columns are markers, so
        we can't change them till all the corresponding cells are set as zero

        first row marker is matrix[0][0] and first column marker is isFirstColumnZero so that's
        why there are two if checks
         */
        for(int i = rows-1; i>=0; i--){
            for(int j = cols-1; j>=0; j--){
                if(j!=0 && matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
                if(j==0 && isFirstColumnZero){
                    matrix[i][0] = 0;
                }
            }
        }
    }

    private static void setZeroes(int[][] matrix) {
        //TC => O(n*m)
        //SC => O(n+m)
        int rows = matrix.length, cols = matrix[0].length;
        int[] zeroPosAtRows = new int[rows],
                zeroPosAtColumns = new int[cols];

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(matrix[i][j] == 0){
                    if(zeroPosAtRows[i] == 0){
                        zeroPosAtRows[i] = j+1;
                    }
                    if(zeroPosAtColumns[j] == 0){
                        zeroPosAtColumns[j] = i+1;
                    }
                }
            }
        }

        for(int i = 0; i<rows; i++){
            if(zeroPosAtRows[i] != 0){
                for(int j = 0; j<cols; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 0; j<cols; j++){
            if(zeroPosAtColumns[j] != 0){
                for(int i = 0; i<rows; i++){
                    matrix[i][j] = 0;
                }
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
