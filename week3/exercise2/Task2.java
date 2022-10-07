package exercise2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Pattern ipPattern = Pattern.compile("^(([\\da-fA-F]{1,4}):){7}+([\\da-fA-F]{1,4})$", Pattern.CASE_INSENSITIVE);
        Scanner ipScanner = new Scanner(System.in);
        System.out.print("Enter address: ");
        String ip = ipScanner.nextLine();
        System.out.println("Address " + ip + (ipPattern.matcher(ip).matches() ? " right" : " not right"));


    }


}
