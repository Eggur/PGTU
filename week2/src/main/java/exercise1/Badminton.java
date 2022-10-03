package exercise1;

import java.util.Scanner;

public class Badminton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сегодня Воскресенье? 1 - да 0 - нет");
        boolean isSunday = scanner.nextInt() == 1 ? true : false;

        System.out.println("Температура: 1 - жарко / 2 - тепло / 3 - холодно");
        int temperatureVariable = scanner.nextInt();

        System.out.println("Осадки: 1 - ясно / 2 - облачно / 3 - дождь " +
                " / 4 - снег / 5 - град");
        int precipitationVariable = scanner.nextInt();

        System.out.println("Ветер: 0 - нет / 1 - да");
        boolean isWind = scanner.nextInt() == 1 ? true : false;

        System.out.println("Влажность: 0 - низкая / 1 - высокая");
        boolean isWet = scanner.nextInt() == 1 ? true : false;

        if (isSunday){
            if (temperatureVariable == 1 | temperatureVariable == 2){
                if (precipitationVariable == 1 | precipitationVariable == 2){
                    if (!isWind){
                        if (!isWet){
                            System.out.println("да");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("нет");
    }


}
