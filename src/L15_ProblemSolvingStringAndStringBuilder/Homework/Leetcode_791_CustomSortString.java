package L15_ProblemSolvingStringAndStringBuilder.Homework;
import java.util.HashMap;

public class Leetcode_791_CustomSortString {
    //https://leetcode.com/problems/custom-sort-string/description/
    public static void main(String[] args) {
        System.out.println(customSortStringUsingHashMap("cbafg", "abcd"));
        System.out.println(customSortStringUsingFrequencyArray("cbafg", "abcd"));
    }

    private static String customSortStringUsingHashMap(String order, String s) {
        //TC => O(length of order string + length of s string)
        //SC => O(1)
        StringBuilder ans = new StringBuilder();
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(order.indexOf(ch) == -1){
                ans.append(ch);
            }
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }
        for(int i = 0; i<order.length(); i++){
            char ch = order.charAt(i);
            if(freq.containsKey(ch)){
                int frequency = freq.get(ch);
                while(frequency-->0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }

    private static String customSortStringUsingFrequencyArray(String order, String s) {
        //TC => O(length of order string + length of s string)
        //SC => O(1)
       StringBuilder sb = new StringBuilder();
       int[] frequencyList = new int[26];
       for(int i = 0; i<s.length(); i++){
           char ch = s.charAt(i);
           if(order.indexOf(ch) == -1) {
               sb.append(ch);
           }
           frequencyList[ch-'a']++;
       }
       for(int i = 0; i<order.length(); i++){
           char ch = order.charAt(i);
           while(frequencyList[ch-'a']-->0){
               sb.append(ch);
           }
       }
       return sb.toString();
    }
}
