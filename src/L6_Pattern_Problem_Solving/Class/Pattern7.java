package L6_Pattern_Problem_Solving.Class;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 15, nspace = n-2, nstar = 1;
        for(int row = 1; row<=n; row++){
            if(row == n/2+1){
                for(int col = 1; col<=n; col++){
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
            }
            System.out.println();
            if(row <= n/2){
                nstar++;
                nspace-=2;
            }
            else{
                nstar--;
                nspace+=2;
            }
        }
    }
}
