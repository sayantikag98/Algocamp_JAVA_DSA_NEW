package L3_Switch_Conditionals;
import java.util.Scanner;

public class ValidTriangleByAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        /*
        To check for valid triangle if three sides (a, b, c) are given:
        a+b>c && b+c>a && c+a>b

        To check for valid triangle if three angles (a, b, c) are given:
        a+b+c = 180 and a>0 and b>0 and c>0
         */
        if(a+b+c == 180 && a>0 && b>0 && c>0){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Not a Valid Triangle");
        }
    }
}
