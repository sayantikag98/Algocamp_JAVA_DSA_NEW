package L6_Pattern_Problem_Solving.Homework;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 5, nval = 1, val = 1;
        for(int row = 1; row<=2*n-1; row++){
            if(row>n){
                val = 2*n-row;
            }
            for(int col = 1; col<=nval; col++){
                System.out.print(val);
                if(col<=nval/2){
                    val--;
                }
                else{
                    val++;
                }
            }
            System.out.println();
            if(row<n){
                nval+=2;
            }
            else{
                nval-=2;
            }
        }
    }
}