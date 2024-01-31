package L6_Pattern_Problem_Solving.Class;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 7, nval = 1;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=nval; col++){
                System.out.print(col+" ");
            }
            System.out.println();
            if(row<=n/2){
                nval++;
            }
            else{
                nval--;
            }
        }
    }
}
