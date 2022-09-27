import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Enter the edge length: ");
        Scanner scanner = new Scanner(System.in);
        double edge = scanner.nextDouble();

        double volume = 5.0 / 12.0 * (3 + (Math.sqrt(5))) * Math.pow(edge, 3);

        System.out.println("Volume: " + volume);

    }
}
