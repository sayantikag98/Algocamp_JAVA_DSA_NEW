package L3_Switch_Conditionals;
import java.util.Scanner;

public class FindRootsOfQuadraticEquation {
    public static void main(String[] args) {
        /*
        roots of quadratic equation = (-b ± √ (b² – 4ac) )/2a
         */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        float squareRootDiscriminant = (float)Math.sqrt(b*b - 4*a*c);
        float root1 = (-b + squareRootDiscriminant)/(2*a);
        float root2 = (-b - squareRootDiscriminant)/(2*a);
        System.out.println(root1+" "+root2);
    }
}
