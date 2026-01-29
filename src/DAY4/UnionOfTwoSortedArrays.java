package DAY4;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st array length:");
        int len1 = sc.nextInt();
        int[] nums1 = new int[len1];
        System.out.print("Enter the 1st array elements:");
        for (int i = 0; i < len1; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.print("Enter the 2nd array length:");
        int len2 = sc.nextInt();
        int[] nums2 = new int[len2];
        System.out.print("Enter the 2nd array elements:");
        for (int i = 0; i < len2; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println("Union Array:" + unionArray(nums1, nums2));
    }

    public static ArrayList<Integer> unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        while (i < len1 && j < len2) {
            if (nums1[i] == nums2[j]) {
                addIfNotExists(union, nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                addIfNotExists(union, nums1[i]);
                i++;
            } else if (nums2[j] < nums1[i]) {
                addIfNotExists(union, nums2[j]);
                j++;
            }
        }
        while (i < len1) {
            addIfNotExists(union, nums1[i]);
            i++;
        }
        while (j < len2) {
            addIfNotExists(union, nums2[j]);
            j++;
        }
        return union;
    }

    private static void addIfNotExists(ArrayList<Integer> union, int value){
        if(union.isEmpty() || union.get(union.size()-1)!=value){
            union.add(value);
        }
    }
}
