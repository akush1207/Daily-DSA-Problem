package DAY5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length:");
        int len = sc.nextInt();
        int[] nums = new int[len];
        System.out.print("Enter array elements:");
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target:");
        int target = sc.nextInt();
        System.out.println("Indices of the sum of " + target + " are " + Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if (prefixSum.containsKey(required)) {
                return new int[]{prefixSum.get(required), i};
            }
            prefixSum.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
