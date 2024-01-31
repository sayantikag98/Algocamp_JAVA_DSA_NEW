package L8_Intro_To_Arrays.Class;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3};
        System.out.println(minElement(arr));
    }

    private static int minElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int val: arr){
            min = Math.min(min, val);
        }
        return min;
    }
}
