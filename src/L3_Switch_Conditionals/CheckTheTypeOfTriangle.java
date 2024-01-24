package L3_Switch_Conditionals;

import java.util.Scanner;

import static L3_Switch_Conditionals.ValidTrianglesBySides.checkIfValid;

public class CheckTheTypeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        checkTypeOfTriangle(a,b,c);
    }

    private static void checkTypeOfTriangle(int a, int b, int c){
        if(!checkIfValid(a, b, c)){
            System.out.println("Not a valid triangle");
        }
        else{
            if(a == b && b == c){
                System.out.println("Equilateral");
            }
            else if(a == b || b == c || c == a){
                System.out.println("Isosceles");
            }
            else{
                System.out.println("Scalene");
            }
        }
    }
}
