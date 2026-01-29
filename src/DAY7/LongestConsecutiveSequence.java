package DAY7;

import java.util.*;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array element separated by comma(,):");
        String arr=sc.nextLine();
        int[] nums= Arrays.stream(arr.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println("Longest Consequences:"+longestConsequences(nums));
    }

    public static int longestConsequences(int[] nums){
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int curr=num;
                int count=1;
                while (set.contains(curr+1)){
                    curr++;
                    count++;
                }
                longest=Math.max(longest, count);
            }
        }
        return longest;
    }
}
