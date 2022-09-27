package exercise2;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.println("Pyramid height: ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++){
            for (int k = 0; k < height - i; k++){
                System.out.println(" ");
            } for (int x = 1; x <= i*2+1; x++){
                System.out.println("#");
            }
            System.out.println();
        }


    }
}
