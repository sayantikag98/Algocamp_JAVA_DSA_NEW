package L14_Strings_StringBuilder_Problem_Solving.Class;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        String str = "hello";
        printSubstrings(str);
        System.out.println("____________________________________");
        printSubstringsUsingInBuiltMethod(str);
        System.out.println("____________________________________");
        printSubstringsRecursive(str, 0, 0);
        System.out.println("____________________________________");
        printSubstringsCompleteRecursive(str, 0,0,0);
    }

    private static void printSubstrings(String str){
        for(int i = 0; i<str.length(); i++){
            for(int j = i; j<str.length(); j++){
                for(int k = i; k<=j; k++){
                    System.out.print(str.charAt(k)+" ");
                }
                System.out.println();
            }
        }
    }

    private static void printSubstringsUsingInBuiltMethod(String str){
        for(int i = 0; i<str.length(); i++){ // i is the starting index
            for(int j = i+1; j<=str.length(); j++){  // j is the ending index which is exclusive in substring method
                System.out.println(str.substring(i,j));
            }
        }
    }

    private static void printSubstringsRecursive(String str, int i, int j){
        if(i == str.length()){
            return;
        }
        if(j == str.length()){
            printSubstringsRecursive(str, i+1, i+1);
        }
        else{
            for(int k = i; k<=j; k++){
                System.out.print(str.charAt(k)+" ");
            }
            System.out.println();
            printSubstringsRecursive(str, i, j+1);
        }
    }

    private static void printSubstringsCompleteRecursive(String str, int i, int j, int k){
        if(i == str.length()){
            return;
        }
        if(j == str.length()){
            printSubstringsCompleteRecursive(str, i+1, i+1, i+1);
        }
        else{
            if(k > j){
                System.out.println();
                printSubstringsCompleteRecursive(str, i, j+1, i);
            }
            else{
                System.out.print(str.charAt(k)+" ");
                printSubstringsCompleteRecursive(str, i, j, k+1);
            }
        }
    }
}
