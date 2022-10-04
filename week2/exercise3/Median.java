package exercise3;

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a set of numbers: ");
        String[] inputArray = input.nextLine().split(" ");

        double[] nums = new double[inputArray.length];
        int arrLenght = nums.length;

        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Double.valueOf(inputArray[i]);
        }
        double median;
        if (arrLenght % 2 == 0)
            median = (nums[arrLenght/2] + nums[arrLenght/2 - 1])/2;
        else
            median = nums[arrLenght/2];
        System.out.println(median);

    }

}
