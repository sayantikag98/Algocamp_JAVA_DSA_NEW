package L10_Intro_To_2DArrays.Homework;

public class Leetcode_1351_CountNegativeNumbersInASortedMatrix {
    //https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }

    private static int countNegatives(int[][] grid) {
        int count = 0, j = grid[0].length - 1;
        for(int i = 0; i<grid.length; i++){
            while(j>=0){
                //if at any row, at any column the value becomes positive then count all the numbers next
                // to that positive number which will be the total negatives in that row
                // and then break and start the iteration of the next row at the same value of column
                if(grid[i][j]>=0){
                    count+=grid[0].length-j-1;
                    break;
                }
                //if the value at the current row and column is negative then simply move j to the left
                else{
                    j--;
                }
            }
            //if at any row j becomes negative then that means that all the numbers in that row and all succeeding rows are negative
            //then no need to iterate further
            if(j<0){
                count+=grid[0].length*(grid.length-i);
                break;
            }
        }
        return count;
    }
}
