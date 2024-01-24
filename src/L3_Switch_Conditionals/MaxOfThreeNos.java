package L3_Switch_Conditionals;
import java.util.Scanner;

public class MaxOfThreeNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println(a+" is the largest.");
        }
        else if(b>=c){
            System.out.println(b+" is the largest.");
        }
        else{
            System.out.println(c+" is the largest.");
        }
    }
}
