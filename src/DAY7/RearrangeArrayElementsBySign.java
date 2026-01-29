package DAY7;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array elements separated by comma(,):");
        String arr=sc.nextLine();
        int[] nums= Arrays.stream(arr.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println("Rearranged Array:"+Arrays.toString(reArrangeArray(nums)));
    }
    public static int[] reArrangeArray(int[] nums){
        int len=nums.length;
        int[] ans=new int[len];
        int posInd=0;
        int negInd=1;
        for (int num : nums) {
            if (num > 0) {
                ans[posInd] = num;
                posInd += 2;
            } else {
                ans[negInd] = num;
                negInd += 2;
            }
        }
        return ans;
    }
}
