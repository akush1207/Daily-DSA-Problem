package DAY5;

import java.util.Scanner;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length:");
        int len = sc.nextInt();
        int[] nums = new int[len];
        System.out.print("Enter array elements:");
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Maximum Consecutive one's is "+findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums){
        int max=0;
        int curr=0;
        for(int num:nums){
            if(num==1){
                curr++;
                max=Math.max(curr,max);
            }else{
                curr=0;
            }
        }
        return max;
    }

}
