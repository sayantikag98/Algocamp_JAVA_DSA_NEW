package L5_Ternary_TypeCasting.Class;

public class FindNthFibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13
        int n = 5, a = 0, b = 1, counter = 0;
        while(counter<n){
//            System.out.print(a+" ");
            int c = a + b;
            a = b;
            b = c;
            counter++;
        }
        System.out.println(a);
    }
}
