package L13_Two_Pointers.Class;
import java.util.Arrays;

public class Leetcode_881_BoatsToSavePeople {
    //https://leetcode.com/problems/boats-to-save-people/description/
    public static void main(String[] args) {
        int[] people = {3,5,3,4};
        int limit = 5;
        System.out.println(numRescueBoatsUsingNestedLoops(people, limit));
        System.out.println(numRescueBoatsUsingSortingAndTwoPointer(people, limit));
    }
    private static int numRescueBoatsUsingNestedLoops(int[] people, int limit) {
        /*
        TC => O(n^2)
        SC => O(1)
         */
        int count = 0;
        for(int i = 0; i<people.length-1; i++){
            for(int j = i+1; j< people.length; j++){
                if(people[i] + people[j] <= limit) count++;
            }
        }
        return people.length - 2*count;
    }

    private static int numRescueBoatsUsingSortingAndTwoPointer(int[] people, int limit){
         /*
        TC => O(nlogn)
        SC => O(1)
         */

        /*
        Find the count of pairs whose total weight <= limit, these pairs (2 persons) can travel in one boat and that will
        minimize the total number of boats
        if the pairs cannot be formed then that person will travel single
         */
        Arrays.sort(people);
        int count = 0, i = 0, j = people.length - 1;
        //i<=j is imp here MADE MISTAKE because that particular even if we consider single or in pair doesn't matter we will increase the boat count by 1
        while(i<=j){
            if(people[i]+people[j] <= limit){
                i++;
            }
            count++;
            j--;
        }
        return count;
    }
}
