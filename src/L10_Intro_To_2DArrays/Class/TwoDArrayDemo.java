package L10_Intro_To_2DArrays.Class;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        int[][] demo = new int [2][3];

        System.out.println(demo); //[[I@6acbcfc0
        System.out.println(demo[0]); //[I@5f184fc6
        System.out.println(demo[1]); //[I@3feba861


        //access element
        //default value for integer 2d array is zero
        System.out.println(demo[0][0]); //0
        System.out.println(demo[1][1]); //0


        //getting no of rows
        System.out.println(demo.length); //2


        //getting no of columns
        System.out.println(demo[0].length); //3

        //setting value
        System.out.println(demo[0][0]); //0
        demo[0][0] = 100;
        System.out.println(demo[0][0]); //100


        //print all values of the array
        printIterativeUsingForLoop(demo);
        printIterativeUsingEnhancedForLoop(demo);
        printRecursive(demo, 0, 0);


        //jagged array -> mentioning the no of rows while declaring is imp otherwise it will throw error
        int[][] demoJagged = new int[2][];
        demoJagged[0] = new int[2];
        demoJagged[1] = new int[4];

        //jagged array printing
        for(int i = 0; i<demoJagged.length; i++){
            for(int j = 0; j<demoJagged[i].length; j++){
                System.out.print(demoJagged[i][j]+" ");
            }
            System.out.println();
        }

    }

    private static void printIterativeUsingForLoop(int[][] demo){
        for(int i = 0; i<demo.length; i++){
            for(int j = 0; j<demo[0].length; j++){
                System.out.print(demo[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void printIterativeUsingEnhancedForLoop(int[][] demo){
        //only printing in forward direction allowed in enhanced for loop
        for(int[] arr: demo){
            for(int val: arr){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }

    private static void printRecursive(int[][] demo, int i, int j){
        if(i == demo.length){
            return;
        }
        if(j == demo[0].length){
            System.out.println();
            printRecursive(demo, i+1, 0);
        }
        else{
            System.out.print(demo[i][j]+" ");
            printRecursive(demo, i, j+1);
        }
    }
}
