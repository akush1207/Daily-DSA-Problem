package DAY4;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length:");
        int len = sc.nextInt();
        int[] nums = new int[len];
        System.out.print("Enter array elements:");
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target element:");
        int target=sc.nextInt();
        int ind=linearSearch(nums, target);
        if(ind!=-1){
            System.out.println(target+" is present at index "+ind);
        }else{
            System.out.println(target+" is not present.");
        }
    }

    public static int linearSearch(int[] nums, int target){
        for(int i=0;i< nums.length; i++){
            if(target==nums[i]){
                return i;
            }
        }
        return -1;
    }

}
