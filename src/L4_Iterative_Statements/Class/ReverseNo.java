package L4_Iterative_Statements.Class;

public class ReverseNo {
    public static void main(String[] args) {
        int num = 23678263, ans = 0;
        for(int temp = num; temp>0; temp/=10){
            ans = ans * 10 + temp%10;
        }
        System.out.println(ans);
    }
}
