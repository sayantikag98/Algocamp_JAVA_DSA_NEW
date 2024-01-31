package L6_Pattern_Problem_Solving.Class;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 7, nstar = n-1, nspace = 1;
        for(int row = 1; row<=n; row++){
            if(row == 1){
                for(int col = 1; col<=2*n-1; col++){
                    System.out.print("* ");
                }
            }
            else{
                for(int col = 1; col<=nstar; col++){
                    System.out.print("* ");
                }
                for(int col = 1; col<=nspace; col++){
                    System.out.print("  ");
                }
                for(int col = 1; col<=nstar; col++){
                    System.out.print("* ");
                }
                nstar--;
                nspace+=2;
            }
            System.out.println();
        }
    }
}
