package DAY3;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length:");
        int len = sc.nextInt();
        int[] nums = new int[len];
        System.out.print("Enter array elements:");
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        moveZeros(nums);
        System.out.println("Arrays after moving zero's to end :" + Arrays.toString(nums));
    }

    public static void moveZeros(int[] nums) {
        int ind = -1;
        for (int num : nums) {
            if (num != 0) {
                nums[++ind] = num;
            }
        }
        Arrays.fill(nums, ind + 1, nums.length, 0);
    }
}
