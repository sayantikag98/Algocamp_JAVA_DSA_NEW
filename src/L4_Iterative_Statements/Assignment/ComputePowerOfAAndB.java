package L4_Iterative_Statements.Assignment;

public class ComputePowerOfAAndB {
    public static void main(String[] args) {
        int a = 3, b = 5, power = 1;
        for(int i = 1; i<=b; i++){
            power*=a;
        }
        System.out.println(power);
    }
}
