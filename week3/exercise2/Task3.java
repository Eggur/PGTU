package exercise2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner wordScanner = new Scanner(System.in);
        System.out.println("Enter a sticky word: ");
        String word = wordScanner.nextLine();
        System.out.println("Finished word: " + word.replaceAll("(.)\\1{2,}", "$1"));
    }
}
