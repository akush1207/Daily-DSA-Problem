package DAY2;

import java.util.Scanner;

public class CheckIfArrayIsSortedAndRotated {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length:");
        int len = sc.nextInt();
        int[] nums = new int[len];
        System.out.print("Enter array elements:");
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Is Array rotated and sorted ? " + isArrayRotatedAndSorted(nums));
    }

    public static boolean isArrayRotatedAndSorted(int[] nums) {
        int count = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] > nums[(i + 1) % len]) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }


}
