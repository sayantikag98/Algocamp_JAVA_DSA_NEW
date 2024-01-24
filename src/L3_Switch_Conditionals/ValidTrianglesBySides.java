package L3_Switch_Conditionals;

import java.util.Scanner;

public class ValidTrianglesBySides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(checkIfValid(a,b,c));
    }
    public static boolean checkIfValid(int a, int b, int c){
        return a+b>c && b+c>a && c+a>b;
    }
}
