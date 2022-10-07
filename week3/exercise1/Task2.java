package exercise1;

import java.util.Scanner;

import static java.lang.Math.log;

public class Task2 {
    public static void main(String[] args) {
        Scanner typeString = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = typeString.nextLine();
        System.out.println("Entropy: " + findEntropy(text));
    }

    public static double findEntropy(String str){
        double[] counts = new double[Character.MAX_VALUE];

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            counts[symbol]++;

        }
        int sum = 0;
        for (double count: counts) {
            if (count > 0) sum += count;
        }
        for (int i = 0; i < counts.length; i++){
            if (counts[i] > 0) counts[i] /= sum;
        }
        double result = 0.0;
        for (double count: counts) {
            if (count > 0) result += count * log2(count);
        }

        return -1 * result;
    }
    public static double log2(double x) {
        return Math.log(x) / Math.log(2);
    }

}
