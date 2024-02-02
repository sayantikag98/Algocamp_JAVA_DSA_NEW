package L9_ArrayList_Problem_Solving_1D_Arrays.Class;
import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i<=5; i++){
            al.add(i);
        }
        System.out.println(al); //[1, 2, 3, 4, 5]

        //access element
        System.out.println(al.get(1)); //2

        //modify element
        al.set(0, 10);
        System.out.println(al); //[10, 2, 3, 4, 5]

        System.out.println(al.size()); //5
        //remove element
        al.remove(1);
        System.out.println(al.size()); //4

        //for loop which runs till the size of the arraylist and we are adding/deleting elements
        //from arraylist then that can become a problem bcoz size will increase or decrease itself

        System.out.println(al.contains(100)); //false
    }
}
