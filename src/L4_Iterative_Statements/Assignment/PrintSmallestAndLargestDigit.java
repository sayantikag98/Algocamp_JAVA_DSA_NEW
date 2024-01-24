package L4_Iterative_Statements.Assignment;

public class PrintSmallestAndLargestDigit {
    public static void main(String[] args) {
        int num = 121176, smallestDigit = Integer.MAX_VALUE, largestDigit = Integer.MIN_VALUE;
        for(int temp = num; temp>0; temp/=10){
            int digit = temp%10;
            if(smallestDigit>digit) smallestDigit = digit;
            if(largestDigit<digit) largestDigit = digit;
        }
        System.out.println(smallestDigit+" "+largestDigit);
    }
}
