package L12_Number_System.Class;

public class RepresentNumberInANewNumberSystem {
    public static void main(String[] args) {
        int count = 0, val = 0, bound = 4;
        while(count<25){
            System.out.println(val);
            val++;
            if(val>bound){
                val+=5;
                bound+=10;
            }
            count++;
        }
    }
}
