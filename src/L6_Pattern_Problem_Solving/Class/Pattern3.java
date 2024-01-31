package L6_Pattern_Problem_Solving.Class;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 7, nstar = 1;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=nstar; col++){
                System.out.print("* ");
            }
            System.out.println();
            if(row<=n/2){
                nstar++;
            }
            else{
                nstar--;
            }
        }
    }
}
