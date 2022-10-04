package exercise2;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.println("Pyramid height: ");
        Scanner scanner = new Scanner(System.in);
        int pyramidHeight = scanner.nextInt();
        String line = "#";

        for (int i = 0; i < pyramidHeight; i++){
            for (int k = pyramidHeight - i; k > 0; k--){
                System.out.println(" ");
            }
            System.out.println(line + " " + line);
            line += "#";
            }
        }
}
