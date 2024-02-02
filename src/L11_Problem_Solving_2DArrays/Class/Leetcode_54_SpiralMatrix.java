package L11_Problem_Solving_2DArrays.Class;
import java.util.List;
import java.util.ArrayList;

public class Leetcode_54_SpiralMatrix {
    //https://leetcode.com/problems/spiral-matrix/description/
    //https://youtu.be/3Zv-s9UUrFM?si=qAQnKJLDBtxNbAK1
    public static void main(String[] args) {
        int[][] matrix = {{1}};
        System.out.println(spiralOrder(matrix));
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int top = 0, left = 0, right = m-1, bottom = n-1;
        while(ans.size()<n*m){
            //go right
            for(int j = left; ans.size()<n*m && j<=right; j++){
                ans.add(matrix[top][j]);
            }

            top++;

            //go down
            for(int i = top; ans.size()<n*m && i<=bottom; i++){
                ans.add(matrix[i][right]);
            }

            right--;

            //go left
            for(int j = right; ans.size()<n*m && j>=left; j--){
                ans.add(matrix[bottom][j]);
            }

            bottom--;

            //go up
            for(int i = bottom; ans.size()<n*m && i>=top; i--){
                ans.add(matrix[i][left]);
            }

            left++;

        }
        return ans;
    }


}
