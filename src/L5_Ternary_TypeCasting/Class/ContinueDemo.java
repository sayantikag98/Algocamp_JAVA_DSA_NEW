package L5_Ternary_TypeCasting.Class;

public class ContinueDemo {
    public static void main(String[] args) {
        int i = 1, j = 1;
        while(i<=3){
            System.out.println("outer loop "+i);
            while(j<=3){
                if(j==2){
                    j++;
                    continue;
                }
                System.out.println("inner loop "+j);
                j++;
            }
            i++;
        }
    }
}
