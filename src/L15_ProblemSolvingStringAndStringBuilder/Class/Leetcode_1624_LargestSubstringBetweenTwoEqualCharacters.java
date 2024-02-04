package L15_ProblemSolvingStringAndStringBuilder.Class;
import java.util.HashMap;
import java.util.Arrays;

public class Leetcode_1624_LargestSubstringBetweenTwoEqualCharacters {
    //https://leetcode.com/problems/largest-substring-between-two-equal-characters/description/
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(maxLengthBetweenEqualCharacters(str));
        System.out.println(maxLengthBetweenEqualCharactersUsingHashMap(str));
        System.out.println(maxLengthBetweenEqualCharactersUsingArray(str));
        System.out.println(maxLengthBetweenEqualCharactersUsingAnotherApproach(str));
    }

    private static int maxLengthBetweenEqualCharacters(String s) {
        //TC => O(n^2)
        //SC => O(1)
        int maxLenSubstring = -1;
        for(int start = 0; start<s.length()-1; start++){
            int end = s.length()-1;
            while(start<end){
                if(s.charAt(end) == s.charAt(start)){
                    maxLenSubstring = Math.max(maxLenSubstring, end-start-1);
                }
                end--;
            }
        }
        return maxLenSubstring;
    }

    private static int maxLengthBetweenEqualCharactersUsingHashMap(String s){
        //TC => O(n)
        //SC => O(1) -> there are only 26 distinct lowercase english alphabets possible
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLenSubstring = -1;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(charIndexMap.containsKey(ch)){
                maxLenSubstring = Math.max(maxLenSubstring, i - charIndexMap.get(ch) - 1);
            }
            else{
                charIndexMap.put(ch, i);
            }
        }
        return maxLenSubstring;
    }

    private static int maxLengthBetweenEqualCharactersUsingArray(String s){
        //TC => O(n)
        //SC => O(1) -> there are only 26 distinct lowercase english alphabets possible
        int[] charIndexMap = new int[26];
        int maxLenSubstring = -1;
        for(int i = 0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            if(charIndexMap[idx] != 0){
                maxLenSubstring = Math.max(maxLenSubstring, i - charIndexMap[idx]);
            }
            else{
                charIndexMap[idx] = i+1;
            }
        }
        return maxLenSubstring;
    }

    private static int maxLengthBetweenEqualCharactersUsingAnotherApproach(String s){
        //TC => O(n^2)
        //SC => O(1)
        int maxLenSubstring = -1;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int firstIdx = s.indexOf(ch), lastIdx = s.lastIndexOf(ch);
            if(firstIdx != lastIdx){
                maxLenSubstring = Math.max(maxLenSubstring, lastIdx-firstIdx-1);
            }
        }
        return maxLenSubstring;
    }


}
