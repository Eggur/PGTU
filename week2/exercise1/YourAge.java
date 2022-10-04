package exercise1;


import java.util.Scanner;

public class YourAge {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();

        int ageRemainder = userAge%10;

        if (ageRemainder == 1 && userAge!=11){
            System.out.println(userAge + " год");
        } else if (ageRemainder > 1 && ageRemainder < 5 &&
                (userAge < 10 || userAge > 20)) {
            System.out.println(userAge + " года");
        } else {
            System.out.println(userAge + " лет");
        }

    }
}
