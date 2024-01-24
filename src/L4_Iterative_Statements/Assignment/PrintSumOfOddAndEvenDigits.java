package L4_Iterative_Statements.Assignment;

public class PrintSumOfOddAndEvenDigits {
    public static void main(String[] args) {
        int num = 6993, sumOddDigits = 0, sumEvenDigits = 0;
        for(int temp = num; temp>0; temp/=10){
            int digit = temp%10;
            if((digit&1) == 1) sumOddDigits+=digit;
            else sumEvenDigits+=digit;
        }
        System.out.println(sumOddDigits+" "+sumEvenDigits);
    }
}
