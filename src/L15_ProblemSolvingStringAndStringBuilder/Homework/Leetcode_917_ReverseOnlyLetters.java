package L15_ProblemSolvingStringAndStringBuilder.Homework;

public class Leetcode_917_ReverseOnlyLetters {
    //https://leetcode.com/problems/reverse-only-letters/description/
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLettersShorterCode("a-bC-dEf-ghIj"));
    }

    private static String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = s.length()-1;
        while(i<j){
            while(i<j && Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j))){
                char temp = s.charAt(i);
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
            while(i<j && !Character.isLetter(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetter(s.charAt(j))){
                j--;
            }
        }
        return sb.toString();
    }

    private static String reverseOnlyLettersShorterCode(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0, j = s.length()-1; i<j; i++, j--){
            while(i<j && !Character.isLetter(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetter(s.charAt(j))){
                j--;
            }
            sb.setCharAt(i, s.charAt(j));
            sb.setCharAt(j, s.charAt(i));
        }
        return sb.toString();
    }
}
