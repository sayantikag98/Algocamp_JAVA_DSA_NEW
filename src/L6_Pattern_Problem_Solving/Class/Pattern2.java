package L6_Pattern_Problem_Solving.Class;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 5, nspace = n-1, nstar = 1;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=nspace; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<=nstar; col++){
                System.out.print("* ");
            }
            System.out.println();
            nspace--;
            nstar+=2;
        }
    }
}
