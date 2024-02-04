package L14_Strings_StringBuilder_Problem_Solving.Class;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //represents a mutable sequence of characters
        String str = "Hello";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(str);
        System.out.println(sb); //""
        System.out.println(sb1); //"Hello"
        System.out.println(sb.toString()); //""
        System.out.println(sb1.toString()); //"Hello"

        //check length -> length()
        System.out.println(sb.length()); //0

        //append()
        sb.append("abc");
        System.out.println(sb); //"abc"

        //insert() -> offset range = [0, length()]
        sb.insert(3,'a');
        System.out.println(sb); //"abca"


        //setCharAt()
        sb.setCharAt(0, 'A');
        System.out.println(sb); // "Abca"

        sb.delete(0,2); //start inclusive end exclusive
        System.out.println(sb); //ca

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb); //c

        //for each loop does not work on StringBuilder
    }
}
