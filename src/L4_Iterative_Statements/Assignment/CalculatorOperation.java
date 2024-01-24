package L4_Iterative_Statements.Assignment;
import java.util.Scanner;

public class CalculatorOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator: ");
        char ch = sc.next().toLowerCase().charAt(0);
        while(ch != 'x'){
            System.out.println("Enter the operands: ");
            int a = sc.nextInt(), b = sc.nextInt();
            switch(ch){
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a/b);
                    break;
                case '%':
                    System.out.println(a%b);
                    break;
            }
            System.out.println("Enter the operator: ");
            ch = sc.next().toLowerCase().charAt(0);
        }
    }
}
