package exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class MaxEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array of numbers: ");
        String[] inputArray = scanner.nextLine().split(" ");
        int[] nums = new int[inputArray.length];
        int maxNum = nums[0];
        int count = 0;

        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.valueOf(inputArray[i]);
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxNum) {
                count++;
            }
        }

        System.out.println(count);
    }
}

