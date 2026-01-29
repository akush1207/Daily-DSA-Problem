package DAY8;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOf1dArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array element's separated by comma(,):");
        String arr = sc.nextLine();
        int[] nums = Arrays.stream(arr.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println("Running Sum:" + Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

}
