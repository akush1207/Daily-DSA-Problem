package DAY7;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array elements separated by comma(,):");
        String arr = sc.nextLine();
        int[] nums = Arrays.stream(arr.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
        nextPermutation(nums);
        System.out.println("Next Permutation:" + Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        int breakPoint = -1;
        int len = nums.length;
        for (int i = len - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                breakPoint = i - 1;
                break;
            }
        }
        if (breakPoint == -1) {
            reverse(nums, 0, len - 1);
            return;
        }
        for (int i = len - 1; i > breakPoint; i--) {
            if (nums[i] > nums[breakPoint]) {
                int temp = nums[breakPoint];
                nums[breakPoint] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        reverse(nums, breakPoint + 1, len - 1);
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
