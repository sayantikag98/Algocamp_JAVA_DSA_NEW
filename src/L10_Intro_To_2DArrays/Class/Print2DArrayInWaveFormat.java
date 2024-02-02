package L10_Intro_To_2DArrays.Class;

public class Print2DArrayInWaveFormat {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        printWave(arr);
    }

    private static void printWave(int[][] arr){
        for(int j = 0; j<arr[0].length; j++){
            //odd move up
            if((j&1)==1){
               for(int i = arr.length-1; i>=0; i--){
                   System.out.print(arr[i][j]+" ");
               }
            }
            //even move down
            else{
                for(int i = 0; i<arr.length; i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
