package L14_Strings_StringBuilder_Problem_Solving.Class;

public class CheckIfPalindrome {
    public static void main(String[] args) {
        String str = "Naman";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindromeRecursive(str, 0, str.length()-1));
    }

    private static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while(i<j){
            if(str.charAt(i++) != str.charAt(j--)) return false;
        }
        return true;
    }

    private static boolean isPalindromeRecursive(String str, int i, int j){
        if(i>=j) return true;
        boolean ans = isPalindromeRecursive(str, i+1, j-1);
        return ans && str.charAt(i) == str.charAt(j);
    }
}
