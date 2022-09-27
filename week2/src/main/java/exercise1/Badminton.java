package exercise1;

public class Badminton {
    public static void main(String[] args) {
        // идеальный вариант:
        // тепло,
        // ясно,
        // ветра нет,
        // низкая влажность
        String temperature = "warm";
        String precipitation = "clear";
        String wind = "no";
        String humidity = "low";

        if (temperature == "warm" && precipitation == "clear" &&
                wind == "no" && humidity == "low"){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


}
