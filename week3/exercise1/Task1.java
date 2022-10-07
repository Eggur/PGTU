package exercise1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner stringScanner = new Scanner(System.in);
        String str = stringScanner.nextLine();
        System.out.println("Enter the sub string: ");
        String subString = stringScanner.nextLine();
        System.out.println((str + "\0").split(subString).length);
    }
}
