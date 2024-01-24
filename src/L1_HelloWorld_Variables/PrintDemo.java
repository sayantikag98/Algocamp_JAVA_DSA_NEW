package L1_HelloWorld_Variables;

public class PrintDemo {
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.print("Hello ");
        System.out.print("World");
        System.out.println();
        int x = 10;
        String str = "World";
        System.out.printf("The value of %d%n", x);

        System.out.printf("Hello %s%n", "World");
        System.out.printf("Hello %s%n", str);
        System.out.printf("Hello %s%n", x); // here x is converted from integer to string
    }
}
