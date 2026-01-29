package DAY2;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length:");
        int len = sc.nextInt();
        int[] nums = new int[len];
        System.out.print("Enter array elements:");
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Number of unique elements are " + removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int ind = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[ind++] = nums[i];
            }
        }
        return ind;
    }

}
