package L15_ProblemSolvingStringAndStringBuilder.Class;

public class Leetcode_125_ValidPalindrome {
    //https://leetcode.com/problems/valid-palindrome/
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindromeApproachAlgocamp("A man, a plan, a canal: Panama"));
        System.out.println(isPalindromeApproachAlgocamp1("A man, a plan, a canal: Panama"));
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i<j){
            char charLeft = s.charAt(i), charRight = s.charAt(j);
            boolean leftCharValid = Character.isLetterOrDigit(charLeft), rightCharValid = Character.isLetterOrDigit(charRight);
            if(leftCharValid && rightCharValid){
                if(charLeft != charRight && (charLeft^32) != charRight) return false;
                i++;
                j--;
            }
            if(!leftCharValid){
                i++;
            }
            if(!rightCharValid){
                j--;
            }
        }
        return true;
    }

    private static boolean isPalindromeApproachAlgocamp(String s) {
        ///////// IMPORTANT /////////////
        int i = 0, j = s.length()-1;
        while(i<j){
            char charLeft = Character.toLowerCase(s.charAt(i)), charRight = Character.toLowerCase(s.charAt(j));
            boolean leftCharValid = Character.isLetterOrDigit(charLeft), rightCharValid = Character.isLetterOrDigit(charRight);
            if(leftCharValid && rightCharValid){
                if(charLeft != charRight) return false;
                i++;
                j--;
            }
            if(!leftCharValid){
                i++;
            }
            if(!rightCharValid){
                j--;
            }
        }
        return true;
    }

    private static boolean isPalindromeApproachAlgocamp1(String s) {
        ///////// IMPORTANT /////////////
        for(int i = 0, j = s.length()-1; i<j; i++, j--){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
        }
        return true;
    }
}
