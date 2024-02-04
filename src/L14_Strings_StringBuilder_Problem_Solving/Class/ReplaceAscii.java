package L14_Strings_StringBuilder_Problem_Solving.Class;

public class ReplaceAscii {
    public static void main(String[] args) {
        //"cdEfG" -> "dcFeH"
        String str = "cdEfG";
        System.out.println(replaceAscii(str));
    }
    private static String replaceAscii(String str){
        StringBuilder sb = new StringBuilder(str);
        //for each loop does not work for String and Stringbuilder
        for(int i = 0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            //odd
            if(((i&1)==1)){
                if(ch == 65) ch = 90;
                else if(ch == 97) ch = 122;
                else ch--;
            }
            //even
            else{
                if(ch == 90) ch = 65;
                else if(ch == 122) ch = 97;
                else ch++;
            }
            sb.setCharAt(i, ch);
        }
        return sb.toString();
    }
}
