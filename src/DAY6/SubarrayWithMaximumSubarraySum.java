package DAY6;

import java.util.Arrays;
import java.util.Scanner;

public class SubarrayWithMaximumSubarraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array elements separated by comma(,):");
        String array = sc.nextLine();
        int[] nums = Arrays.stream(array.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println("Subarray with Maximum Subarray Sum: " + Arrays.toString(subarrayWithMaximumSubarraySum(nums)));
    }

    public static int[] subarrayWithMaximumSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int startIndex = 0, endIndex = 0, tempStart = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum > maxSum) {
                maxSum = currSum;
                startIndex = tempStart;
                endIndex = i;
            }
            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            }
        }
        return Arrays.copyOfRange(nums, startIndex, endIndex + 1);
    }

}
