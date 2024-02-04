package L13_Two_Pointers.Homework;

public class Leetcode_75_SortColors {
    //https://leetcode.com/problems/sort-colors/description/
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        sortColorsUsingCountingTwoPass(nums);
        for(int val: nums){
            System.out.print(val+" ");
        }
        System.out.println();
        int[] nums1 = {2,2,1,2,1,1,1,0,0,2,1,0,2,1,2,2,1,1,1,1,1,0,2,0,2,0,2,2,1,0,2,1,0,2,1,2,0,0,0,0,2,1,1,2,0,1,2,2,0,0,2,2,0,1,0,1,0,0,1,1,1,0,0,2,2,2,1,0,0,2,1,0,1,0,2,2,1,2,1,1,2,1,1,0,0,2,1,0,0};
        sortColorsUsingThreePointersSinglePass(nums1);
        for(int val: nums1){
            System.out.print(val+" ");
        }
        System.out.println();
        int[] nums2 = {2,2,1,2,1,1,1,0,0,2,1,0,2,1,2,2,1,1,1,1,1,0,2,0,2,0,2,2,1,0,2,1,0,2,1,2,0,0,0,0,2,1,1,2,0,1,2,2,0,0,2,2,0,1,0,1,0,0,1,1,1,0,0,2,2,2,1,0,0,2,1,0,1,0,2,2,1,2,1,1,2,1,1,0,0,2,1,0,0};
        sortColorsUsingThreePointersSinglePassAnotherBetterApproach(nums2);
        for(int val: nums2){
            System.out.print(val+" ");
        }
    }

    private static void sortColorsUsingCountingTwoPass(int[] nums) {
        int countOnes = 0, countTwos = 0, countZeroes = 0;
        for(int val: nums){
            if(val == 0) countZeroes++;
            if(val == 1) countOnes++;
            if(val == 2) countTwos++;
        }
        int idx = 0;
        while(countZeroes-->0){
            nums[idx++] = 0;
        }
        while(countOnes-->0){
            nums[idx++] = 1;
        }
        while(countTwos-->0){
            nums[idx++] = 2;
        }
    }

    private static void sortColorsUsingThreePointersSinglePass(int[] nums){
        /*
        left of first -> all zeroes
        right of first till second -> all ones
        right of second till third -> unsorted
        right of third -> all twos

        1. if first is not pointing to zero and second or third is pointing to zero then swap,
            after swap first points to one and second or third may point to 1 or 2
            (it is possible for second or third to point to 0, 1, or 2 after swap because right of second and left of third
            is unsorted which can have anything)

        2. if second is not pointing to one and third is pointing to one then swap,
            after swap second points to 2 and third may point to 0 or 2

            NOTE HERE IMPORTANT: if the second is not pointing to 1 and first is pointing to 1 we cannot swap
            the reason being if the swap is done then seconds will point to 1 but first may point to 0 or 2 and first
            cannot point to 2 because first can only point to 0 or 1 (left of first will have all zeroes and right will have ones)

         3. if the third is not pointing to 2 and first or second is pointing to 2 then swap,
            after swap third will point to 2 and first or second may point to 0 or 1

         4. if third points to 2 decrement
         5. if second points to 0 or 1 increment
         6. if first points to 0 increment

         while moving the pointers first can only point to 0 or 1, second can point to 0, 1, or 2 and third can also point
         to 0, 1, or 2. first cannot point to 2 and left of second should be sorted and can only contain 0 and 1.

         */
        int first = 0, second = 0, third = nums.length-1;
        while(first<=second && second<=third){
            if(nums[first] != 0 && nums[second] == 0){
                nums[second] = nums[first];
                nums[first] = 0;
            }

            if(nums[first] != 0 && nums[third] == 0){
                nums[third] = nums[first];
                nums[first] = 0;
            }


            if(nums[second] != 1 && nums[third] == 1){
                nums[third] = nums[second];
                nums[second] = 1;
            }


            if(nums[third] != 2 && nums[first] == 2){
                nums[first] = nums[third];
                nums[third] = 2;
            }

            if(nums[third] != 2 && nums[second] == 2){
                nums[second] = nums[third];
                nums[third] = 2;
            }

           if(nums[third] == 2) third--;
           if(nums[second] < 2) second++;
           if(nums[first] == 0) first++;
        }
    }

    private static void sortColorsUsingThreePointersSinglePassAnotherBetterApproach(int[] nums){
        /*
        https://leetcode.com/problems/sort-colors/solutions/26481/python-o-n-1-pass-in-place-solution-with-explanation
        This is a dutch partitioning problem. We are classifying the array into four groups: red, white, unclassified, and blue.
        Initially we group all elements into unclassified. We iterate from the beginning as long as the white pointer is less
        than the blue pointer.

        If the white pointer is red (nums[white] == 0), we swap with the red pointer and move both white and red pointer
        forward. If the pointer is white (nums[white] == 1), the element is already in correct place, so we don't have
        to swap, just move the white pointer forward. If the white pointer is blue, we swap with the latest unclassified
        element.
         */
        int first = 0, second = 0, third = nums.length - 1;
        //very imp to run the loop till second<=third
        while(second<=third){
            if(nums[second] == 0){
                //swap nums[second] with nums[first]
                nums[second] = nums[first];
                nums[first] = 0;
                //increment both
                second++;
                first++;
            }
            else if(nums[second] == 1){
                second++;
            }
            else{
                //swap nums[second] with nums[third]
                nums[second] = nums[third];
                nums[third] = 2;
                //only decrement third
                third--;
            }
        }
    }
}
