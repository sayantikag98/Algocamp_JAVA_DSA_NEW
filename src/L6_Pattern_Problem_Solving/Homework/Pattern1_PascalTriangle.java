package L6_Pattern_Problem_Solving.Homework;

public class Pattern1_PascalTriangle {
    public static void main(String[] args) {
        //Pascal's Triangle
        int n = 7, nspace = n-1;
        for(int row = 0; row<n; row++){
            for(int col = 0; col<nspace; col++){
                System.out.print("  ");
            }
            for(int col = 0; col<=row; col++){
                System.out.print(combination(row, col)+" ");
                System.out.print("  ");
            }
            System.out.println();
            nspace--;
        }
    }

    private static int combination(int n, int r){
        return factorial(n)/(factorial(r) * factorial(n-r));
    }

    private static int factorial(int n){
        if(n<=1) return 1;
        return n * factorial(n-1);
    }
}
