package L6_Pattern_Problem_Solving.Homework;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 11, nstar = 1;
        System.out.println("*");
        n-=2;
        for(int row = 1; row<=n; row++){
            if(row == n/2+1){
                for(int col = 1; col<=n; col++){
                    System.out.print("*");
                }
            }
            else{
                for(int col = 1; col<=nstar; col++){
                    System.out.print("*");
                }
                System.out.print(" ");
                for(int col = 1; col<=nstar; col++){
                    System.out.print("*");
                }
            }
            System.out.println();
            if(row <= n/2){
                nstar++;
            }
            else{
                nstar--;
            }
        }
        System.out.println("*");
    }
}
