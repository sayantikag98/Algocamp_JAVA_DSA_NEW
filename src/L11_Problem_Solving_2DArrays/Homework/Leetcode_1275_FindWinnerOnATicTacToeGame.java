package L11_Problem_Solving_2DArrays.Homework;

public class Leetcode_1275_FindWinnerOnATicTacToeGame {
    //https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/description/
    public static void main(String[] args) {
        int[][] moves = {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}};
        System.out.println(tictactoe(moves));
    }

    private static String tictactoe(int[][] moves) {
        int[][] matrix = new int[3][3];
        boolean isA = true;
        for(int[] arr: moves){
            if(isA){
                matrix[arr[0]][arr[1]] = 1;
                isA = false;
            }
            else{
                matrix[arr[0]][arr[1]] = 2;
                isA = true;
            }
        }

        if(checkIfAOrBWins(matrix, 1) == 1){
            return "A";
        }
        if(checkIfAOrBWins(matrix, 2) == 2){
            return "B";
        }

        if(moves.length == 9) return "Draw";
        return "Pending";
    }

    private static int checkIfAOrBWins(int[][] matrix, int value){
        if(
                (matrix[0][0] == matrix[0][1] && matrix[0][1] == matrix[0][2] && matrix[0][2] == value) ||
                        (matrix[1][0] == matrix[1][1] && matrix[1][1] == matrix[1][2] && matrix[1][2] == value) ||
                        (matrix[2][0] == matrix[2][1] && matrix[2][1] == matrix[2][2] && matrix[2][2] == value) ||
                        (matrix[0][0] == matrix[1][0] && matrix[1][0] == matrix[2][0] && matrix[2][0] == value) ||
                        (matrix[0][1] == matrix[1][1] && matrix[1][1] == matrix[2][1] && matrix[2][1] == value) ||
                        (matrix[0][2] == matrix[1][2] && matrix[1][2] == matrix[2][2] && matrix[2][2] == value) ||
                        (matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2] && matrix[2][2] == value) ||
                        (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0] && matrix[2][0] == value)
        ){
            return value;
        }
        return -1;
    }
}
