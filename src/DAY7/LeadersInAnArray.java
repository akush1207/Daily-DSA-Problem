package DAY7;

import java.util.*;

public class LeadersInAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array elements separated by comma(,):");
        String arr=sc.nextLine();
        int[] nums= Arrays.stream(arr.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println("Leader's:"+leaders(nums));
    }

    public static List<Integer> leaders(int[] nums) {
        List<Integer> leaders=new ArrayList<>();
        int greater=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>greater){
                greater=nums[i];
                leaders.add(greater);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
