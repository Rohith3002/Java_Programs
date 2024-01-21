package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int[] result = twoSum(nums, target);
        if(result.length==0){
            System.out.println("No indices found to add to get the target");
        }else{
        System.out.println("Indices to add to get the required target are:");
        System.out.println(Arrays.toString(result));}
    }
        public static int[] twoSum ( int[] nums, int target){
            int n = nums.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{}; // No solution found
        }
    }

