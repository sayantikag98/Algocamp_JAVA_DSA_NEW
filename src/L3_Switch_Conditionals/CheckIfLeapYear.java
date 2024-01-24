package L3_Switch_Conditionals;
import java.util.Scanner;

public class CheckIfLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        /*
        To check if a year is a leap year or not it should satisfy either one of the below conditions:
        1. year is divisible by 4 and not divisible by 100
        2. year is divisible by 400
         */

        if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
