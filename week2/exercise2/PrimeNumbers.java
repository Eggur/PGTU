package exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of numbers: ");
        int number = scanner.nextInt();

        int[] prime = new int[number + 1];
        for (int i = 2; i <= number; i++){
            prime[i] = i;
        }

        for (int i = 2; i * i <= number; i++) {
            for (int j = i * i; j <= number; j += i) {
                prime[j] = 0;
            }
        }

        System.out.println("Prime numbers: ");

        for(int i = 2; i <= number; i ++) {
            if(prime[i] != 0) {
                System.out.print(prime[i] + " ");
            }
        }
    }

}
