package DAY6;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array elements separated by comma(,):");
        String array = sc.nextLine();
        int[] nums = Arrays.stream(array.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println("Majority Element: " + majorityElement(nums));
    }

    //Boyer–Moore Voting Algorithm
    public static int majorityElement(int[] nums) {
        int majority = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                majority = num;
            }
            count += (num == majority) ? 1 : -1;
        }
        return majority;
    }

}
