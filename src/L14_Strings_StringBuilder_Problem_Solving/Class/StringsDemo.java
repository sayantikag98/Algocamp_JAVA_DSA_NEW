package L14_Strings_StringBuilder_Problem_Solving.Class;

public class StringsDemo {
    public static void main(String[] args) {

        //String declaration and initialization

        //using String literal
        String name = "Say";
        System.out.println(name); //Say

        //using new keyword
        String name1 = new String("L");
        System.out.println(name); //Say
        name = new String(name1);
        System.out.println(name); //L

        /*
        1. String is not a primitive datatype
        2. name in the above examples are object of predefined class String
         */

        //String operation

        //checking length of the string
        String greet = "Hello";
        System.out.println(greet.length()); //5


        //join two strings
        String msg = greet+greet;
        System.out.println(msg); //HelloHello
        msg = greet.concat(greet); // concat returns the concatenated string
        System.out.println(msg); //HelloHello
        System.out.println(greet); //Hello



        //compare two strings
        System.out.println(msg.equals(greet)); //false
        System.out.println("_______________");
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        System.out.println(str1 == str2); //true
        System.out.println(str2 == str3); //false
        System.out.println(str1.equals(str2)); //true
        System.out.println(str2.equals(str3)); //true
        String str4 = str3;
        System.out.println(str4 == str3); // true
        System.out.println(str4.equals(str3)); //true
        /*
            == -> compare references
            equals -> compare value
         */

        System.out.println("my \"dhsfhg"); //my "dhsfhg //escaping double quote

        /*
        Strings are IMMUTABLE IN JAVA

        once the string is created, it cannot be changed.
        Java maintains a pool of unique string literals in memory. When you create a string literal, the Java Virtual Machine (JVM) checks if an equivalent string is already in the pool.
        If an equivalent string exists, the existing reference to that string is returned, and no new object is created. This helps conserve memory by avoiding the creation of duplicate string objects.
         */

        //get the particular character in the string
        String s1 = "string";
        System.out.println(s1.charAt(0)); //s
        System.out.println(s1.substring(0,3)); //str -> including start index and excluding end index
        System.out.println(s1.substring(0)); //string
        System.out.println(s1.lastIndexOf('l')); //-1
        System.out.println(s1.startsWith("str")); //true
        System.out.println(s1.startsWith("Str")); //false
        System.out.println(s1.startsWith("r", 2)); //true

        //for each loop does not work on String
    }
}
