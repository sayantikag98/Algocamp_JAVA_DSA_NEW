package L6_Pattern_Problem_Solving.Homework;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 5, nstar = 2*n-1;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=nstar; col++){
                System.out.print("*");
            }
            System.out.println();
            nstar-=2;
        }
    }
}
