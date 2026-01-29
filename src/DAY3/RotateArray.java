package DAY3;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length:");
        int len = sc.nextInt();
        int[] nums = new int[len];
        System.out.print("Enter array elements:");
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k:");
        int k = sc.nextInt();
        rotate(nums, k);
        System.out.println("Array after rotated " + k + " times :" + Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        reverse(nums, len - k, len - 1);
        reverse(nums, 0, len - k - 1);
        reverse(nums, 0, len - 1);
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

}
