package L15_ProblemSolvingStringAndStringBuilder.Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_151_ReverseWordsInAString {
    //https://leetcode.com/problems/reverse-words-in-a-string/
    public static void main(String[] args) {
        String str = "  the  sky is blue     ";
        System.out.println(reverseWords(str));
        System.out.println(reverseWordsAnotherApproach(str));
        System.out.println(reverseWordsAnotherApproach1(str));
        System.out.println(reverseWordsAnotherApproach2Algocamp(str));
    }

    private static String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }
            else{
                if(sb.charAt(sb.length()-1) != ' ') sb.append(' ');
            }
        }
        int i = 0, j = 0;
        while(j<=sb.length()){
            if(j<sb.length() && sb.charAt(j) != ' '){
                j++;
            }
            else{
                int k = j-1, l = i;
                while(l<k){
                    char temp = sb.charAt(l);
                    sb.setCharAt(l, sb.charAt(k));
                    sb.setCharAt(k, temp);
                    l++;
                    k--;
                }
                i=++j;
            }

        }
        return sb.toString();
    }

    private static String reverseWordsAnotherApproach(String s){
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int j = s.length()-1, i = j;
        while(j>=-1){
            if(j>=0 && s.charAt(j) != ' '){
                j--;
            }
            else{
                sb.append(s, j+1, i+1);
                while(j>=0 && s.charAt(j) == ' ') j--;
                // append space after every word except the last one
                // during the last word when j reaches -1 then do decrement j
                if(j!=-1) sb.append(' '); //MADE MISTAKE
                else j--; //MADE MISTAKE
                i=j;
            }
        }
        return sb.toString();
    }

    private static String reverseWordsAnotherApproach1(String s){
        String[] strArr = s.trim().split(" ");
        /*
            eg: s = "  the  sky is blue     "
             String[] strArr = s.trim().split(" ");
             strArr will become [the, , sky, is, blue]
             strArr[1] is an empty string


             we can also use String[] strArr = s.trim().split("//s+") for splitting upon multiple spaces
             strArr will become [the, sky, is, blue]
         */

        StringBuilder sb = new StringBuilder();

        for(int i = strArr.length - 1; i>=0; i--){
            if(!strArr[i].isEmpty()){
                sb.append(strArr[i]);
                if(i!=0) sb.append(" ");
            }
        }
        return sb.toString();
    }

    private static String reverseWordsAnotherApproach2Algocamp(String s){

        ////////////////////////VERY IMPORTANT ///////////////////////////

        String[] strArr = s.trim().split("\\s+");
        /*
            eg: s = "  the  sky is blue     "
             String[] strArr = s.trim().split("\\s+");
             strArr will become [the, sky, is, blue]
             use split("\\s+") for splitting upon multiple spaces
         */
        //convert to a List<String> and reverse
        List<String> listStrArr = Arrays.asList(strArr).reversed();
        //join every word in the List by putting a space in between
        return String.join(" ", listStrArr);


        //convert Array to List<> -> Arrays.asList()
        //convert Array to String => String.join(delimiter, Array)
    }


}
