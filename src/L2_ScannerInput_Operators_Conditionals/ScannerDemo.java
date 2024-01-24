package L2_ScannerInput_Operators_Conditionals;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float f = sc.nextFloat(); // stores around 6-7 digits
        double d = sc.nextDouble(); // stores around 15-16 digits

        System.out.println(n+" "+f+" "+d);


        /*
        Problem: Taking the input of string after the integer,
        in the console the string input is just skipped and moves to the next input.

        Solution: This is a common problem, and it happens because the nextInt method doesn't
        read the newline character of your input, so when you issue the command nextLine,
        the Scanner finds the newline character and gives you that as a line.

        A workaround could be this one:

        System.out.println("Enter id");
        id1 = in.nextInt();

        in.nextLine();   // skip the newline character

        System.out.println("Enter name");
        name1 = in.nextLine();
         */

        int n1 = sc.nextInt();
        sc.nextLine(); //after integer input if we want to take string input then we have to put this line
        String str = sc.nextLine();
        System.out.println(n1+" "+str);
    }
}
