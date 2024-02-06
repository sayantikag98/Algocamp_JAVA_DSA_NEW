package L15_ProblemSolvingStringAndStringBuilder.Homework;

public class Leetcode_1616_SplitTwoStringsToMakePalindrome {
    public static void main(String[] args) {
        String str1 = "pvhmupgqeltozftlmfjjde", str2 = "yjgpzbezspnnpszebzmhvp";
        System.out.println(checkPalindromeFormation(str1, str2));
        System.out.println(checkPalindromeFormationOptimizedApproach(str1, str2));
    }

    private static boolean checkPalindromeFormation(String a, String b) {
        //TC => O(n^2) where n is the length of the string and length of both the strings are same
        //SC => O(1)
        /*
        Going to every single split possible for the two strings
        and checking whether string a prefix concatenated with string b suffix is forming a palindrome
        or checking whether string b prefix concatenated with string a suffix is forming a palindrome
         */
        for(int i = 0; i<=a.length(); i++){
            if(isPalindrome(a.substring(0, i)+b.substring(i)) || isPalindrome(b.substring(0,i) + a.substring(i))) return true;
        }
        return false;
    }

    private static boolean isPalindrome(String str){
        int i = 0, j = str.length()-1;
        while(i<j && str.charAt(i) == str.charAt(j)){
            i++;
            j--;
        }
        return i>=j;
    }

    private static boolean checkPalindromeFormationOptimizedApproach(String a, String b) {
        //TC => O(n) where n is the length of the string and length of both the strings are same
        //SC => O(1)
        /*
        1. At first start traversing string a from the left (i pointer moving from left to right) and string b
            from the right (j pointer moving from right to left) till you see the characters on both the ends are
            not the same
        2. Once reached a point where a.charAt(i) != b.charAt(j), start check whether any one of the string a
            or string b is palindrome within the range of indices from i to j
        3. If any of the string a or string b is palindrome within i and j indices return true
        4. Otherwise, again start traversing string b from the left (i pointer moving from left to right) and
            string a from the right (j pointer moving from right to left) till you see the characters on both
            the ends are not the same
        5. Once reached a point where b.charAt(i) != a.charAt(j), start check whether any one of the string a
            or string b is palindrome within the range of indices from i to j
        6. If any of the string a or string b is palindrome within i and j indices return true
        7. Otherwise, return false
         */

        //Ref: Leetcode solution with illustration for better understanding the intuition
        //https://leetcode.com/problems/split-two-strings-to-make-palindrome/solutions/891646/java-greedy-explanation-to-o-n-solution

        return checkIfPalindrome(a, b) || checkIfPalindrome(b, a);
    }

    private static boolean checkIfPalindrome(String a, String b){
        int i = 0, j = b.length()-1;
        while(i<j && a.charAt(i) == b.charAt(j)){
            i++;
            j--;
        }
        return isPalindromeWithinRange(a, b, i, j);
    }

    private static boolean isPalindromeWithinRange(String a, String b, int i, int j){
        boolean isPalindromeA = true, isPalindromeB = true;
        while(i<j){
            if(isPalindromeA && a.charAt(i) != a.charAt(j)) isPalindromeA = false;
            if(isPalindromeB && b.charAt(i) != b.charAt(j)) isPalindromeB = false;
            i++;
            j--;
        }
        return isPalindromeA || isPalindromeB;
    }
}
