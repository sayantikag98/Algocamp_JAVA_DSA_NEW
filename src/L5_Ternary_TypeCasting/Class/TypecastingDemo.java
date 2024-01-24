package L5_Ternary_TypeCasting.Class;

public class TypecastingDemo {
    public static void main(String[] args) {
        /*
        Implicit typecasting or automatic typecasting or widening typecasting or casting down
        -------------------------------------------------------------------------------------
        1. converting smaller datatype to bigger datatype
        2. compiler can do this automatically
        3. byte -> short -> int -> long -> float -> double
        4. byte can get converted to short, int, long, float, double
        5. short can get converted to int, long, float, double
        6. int can get converted to long, float, double
        7. long can get converted to float, double
        8. float can get converted to double
        9. Point to note -> long can get converted to float and this is defined in the doc as implicit typecasting
           though this may lead to loss in precision but still compiler automatically does this without throwing error
         */

        // CASE 1
        byte by = 10;
        short sh = 10;
        int in = 10;
        long lo = -1000000000; //without L at end this 10 is an integer, so it can store up to -10^9 to 10^9 without error

        // int -> approx -10^9 to 10^9
        // long -> approx -10^18 to 10^18

//        by = sh; //error
//        by = in; //error
//        by = lo; //error


        sh = by;
//        sh = in; //error
//        sh = lo; //error

        in = by;
        in = sh;
//        in = lo; //error

        lo = by;
        lo = sh;
        lo = in;


        // CASE 2
        //byte range -> -128 to 127
        by = (byte)128;
        System.out.println(by); //-128
        by = (byte) 129;
        System.out.println(by); //-127
        by = (byte) -129;
        System.out.println(by); //127
        by = (byte) -130;
        System.out.println(by); //126

        /*
        128 -> -128
        129 -> -127
        130 -> -126
        -129 -> 127
        -130 -> 128
         */



//        for(byte b = 127; b>=-128; b--){
//            System.out.println(b);
//        }
        // runs into infinite loop bcoz when b becomes -129 it is automatically converted to 127 and loop runs again and again


        // CASE 3
        float f = 10.6f; // without f or F 10.6 is considered double

        double d = 3.5;
//        f = d; //error
        d = f;

//        in = f; //error
//        in = d; //error
//        lo = f; //error
//        lo = d; //error

        in = (int)f;
        System.out.println(in); //10


        //Use cases of typecasting: 1.legacy code 2. 5/2 = 2, 5/2.0 = 5.0/2 = 5.0/2.0 = 2.5

        // CASE 4 (This will be used very much)
        char ch = 'a';
        int ichar = ch;
//        char ch1 = ichar; // error
        char ch1 = (char)ichar;

        System.out.println(ch); //a
        System.out.println(ichar); //97
        System.out.println(ch1); //a


        //In java character can be represented as integers using their corresponding UNICODE value
        char ch2 = 70; //does not throw error
        System.out.println(ch2); //F
//        ch = ch+1; //error
        ch2 = (char)(ch2 + 1);
        System.out.println(ch2); //G


        /*
        Q. char ch = 'a';
            ch = ch + 5 throws error but ch = 'a' + 5 does not throw error

        A. (CHAT-GPT)
        In Java, when you perform an operation on two variables of a primitive data type (such as char),
         the result is promoted to the wider of the two data types involved in the operation.
         In the case of ch = ch + 5;, the right-hand side of the expression involves an addition
         of a char (ch) and an int (5). According to the rules of binary numeric promotion in Java,
         the char is promoted to an int before the addition takes place. The result of the addition
         is then assigned back to ch, but since ch is of type char, a narrowing conversion is required,
          and this is where the error occurs.

        Let's break it down step by step:

        step 1: ch is a char.
        step 2: 5 is an int.
        step 3: The addition ch + 5 involves binary numeric promotion, so ch is promoted to an int.
        step 4: The result of the addition is of type int.
        step 5: Assigning this int result back to ch requires a narrowing conversion,
                and this is where the error occurs because narrowing conversions in Java require an explicit cast.

        On the other hand, when you write ch = 'a' + 5;, the right-hand side involves a constant expression ('a' + 5).
         During compilation, the compiler can evaluate this constant expression and determine that the result
         can fit into a char. Therefore, it doesn't raise an error, and the assignment is allowed.

         In java char is 16-bit unsigned integer, smallest unsigned 16-bit number is 0 and the largest is 65535.
         So if we do ch = 'a' + (65535 - 97), the compiler evaluates this constant expression and result is within
         the bounds of character so no error is thrown. Any value greater than 65535-97 (65438) will throw error.

        If you want to avoid the error in the first case, you can perform an explicit cast:
        ch = (char) (ch + 5);

        This tells the compiler that you are aware of the potential loss of information due to the narrowing
        conversion, and you are explicitly allowing it.
         */


        ch2 = 'a';
//        ch2 = ch2 +5; //error

        ch2 = 'a'+65438;
        ch2 = 'a' + 5;
//        ch2 = 'a'+65439;//error
        System.out.println(ch2); //f
        ch2 = (char)('a'+ch2);
        System.out.println(ch2); //Ç


        // CASE 5
        //expressions are evaluated from left to right


        System.out.println(10 + "hello");
        //10hello -> 10 concatenated with "hello"


        System.out.println(10+20+"hello");
        //30hello -> 10+20 = 30 concatenated with "hello" to make "30hello"


        System.out.println(10+20+"hello"+40+50);
        /*30hello4050 -> 10+20 = 30 concatenated with "hello" to make "30hello"
         which is further concatenated with 40 to make "30hello40" which is further
        concatenated with 50 to make "30hello4050"
         */



        System.out.println(2+' '+5);
        /* 2+32+5 = 39 -> these are all constants so compiler can add them,
         2 will be added with unicode value of space which is 32 and now 34 will be added to 5
         which is equal to 39
         */


        System.out.println(2+'\t'+5);
        /* 2+9+5 = 16 -> these are all constants so compiler can add them,
         2 will be added with unicode value of tab which is 9 and now 11 will be added to 5
         which is equal to 16
         */


        System.out.println(2+" "+5);
        //2 5 -> 2 concatenated with " " to make "2 " which is further concatenated with 5 to make "2 5"


        System.out.println(2+"\t"+5);
        //2   5 -> 2 concatenated with "\t" to make "2  " which is further concatenated with 5 to make "2   5"


        System.out.println("hello"+'\t'+"world");
        //hello   world -> "hello" concatenated with "\t" to make "hello    " which is further concatenated with "world" to make "hello    world"


    }
}
