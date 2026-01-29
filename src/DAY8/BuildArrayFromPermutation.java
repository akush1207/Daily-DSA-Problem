package DAY8;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array element separated by comma(,):");
        String arr = sc.nextLine();
        int[] nums = Arrays.stream(arr.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println("ans:" + Arrays.toString(buildArray(nums)));
        System.out.println("ans:" + Arrays.toString(buildArray_Optimized(nums)));
    }

    // Brute Force Approach -- With O(N) Space Complexity
    public static int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    // Optimized Approach --  With O(N) Space Complexity
    public static int[] buildArray_Optimized(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }
        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }
        return nums;
    }
}
