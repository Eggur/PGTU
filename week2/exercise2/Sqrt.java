package exercise2;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = scanner.nextInt();
        double result = 0;

        if (number > 0){
            result = sqrt(number);
        } else{
            System.out.println("Exception: user entered 0");
        }

        System.out.println(result);
    }
    static double sqrt(int inputNumber){
        double result = inputNumber;
        int i = 0;
        while ((result * result > inputNumber) && (i < 100)) {
            result = ((result + inputNumber / result) / 2);
            i++;
        }
        return result;
    }
}
