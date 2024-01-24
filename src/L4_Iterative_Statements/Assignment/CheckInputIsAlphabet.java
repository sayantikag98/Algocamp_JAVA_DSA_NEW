package L4_Iterative_Statements.Assignment;
import java.util.Scanner;

public class CheckInputIsAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        /*
        ASCII of A-Z -> 65 to 90
        ASCII of a-z -> 97 to 122
        ASCII of 0-9 -> 48 to 57
         */
        if(ch>=65 && ch<=90){
            System.out.println('U');
        }
        else if(ch>=97 && ch<=122){
            System.out.println('L');
        }
        else if(ch>=48 && ch<=57){
            System.out.println('D');
        }
        else{
            System.out.println('|');
        }
    }
}
