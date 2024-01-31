package L7_Functions;

public class IsArmstrong {
    public static void main(String[] args) {
        // if armstrong then abcd = a^n + b^n + c^n + d^n where n is the total no of digits
        int n = 1634;
        System.out.println(isArmstrong(n));
        System.out.println(isArmStrongUsingRecusiveMethods(n));
        printArmstrongWithinRange(100, 500);
    }

    private static void printArmstrongWithinRange(int low, int high){
        for(int i = low; i<=high; i++){
            if(isArmStrongUsingRecusiveMethods(i)){
                System.out.println(i+" ");
            }
        }
    }

    private static boolean isArmstrong(int n){
        if(n<0) return false;
        int countDigits = 0;
        for(int temp = n; temp>0; temp/=10){
            countDigits++;
        }
        int sumOfPower = 0;
        for(int temp = n; temp>0; temp/=10){
            int digit = temp%10;
            sumOfPower+=power(digit, countDigits);
        }
        return n == sumOfPower;
    }

    private static boolean isArmStrongUsingRecusiveMethods(int n){
        if(n<0) return false;
        return n == sumOfPowerUsingRecursion(n, countDigitsUsingRecursion(n));
    }

    private static int power(int digit, int n){
        int powerOfDigit = 1;
        for(int i = 1; i<=n; i++){
            powerOfDigit *= digit;
        }
        return powerOfDigit;
    }

    private static int countDigitsUsingRecursion(int n){
        if(Math.abs(n)<10) return 1;
        return countDigitsUsingRecursion(n/10) + 1;
    }

    private static int sumOfPowerUsingRecursion(int n, int countDigits){
        if(n == 0) return 0;
        return sumOfPowerUsingRecursion(n/10, countDigits) + power(n%10, countDigits);
    }
}
