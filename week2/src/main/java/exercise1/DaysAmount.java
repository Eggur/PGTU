package exercise1;

public class DaysAmount {
    public static void main(String[] args) {
        String date = "February";
        int year = 2012;
        int yearRemainder = year%4;

        switch (date){
            case "January":
                System.out.println("in " + date + " 31 days");
                break;
            case "February":
                if (yearRemainder == 0){
                    System.out.println("in " + date + " 29 days");
                } else {
                    System.out.println("in " + date + " 28 days");
                }
                break;
            case "March":
                System.out.println("in " + date + " 31 days");
                break;
            case "April":
                System.out.println("in " + date + " 30 days");
                break;
            case "May":
                System.out.println("in " + date + " 31 days");
                break;
            case "June":
                System.out.println("in " + date + " 30 days");
                break;
            case "July":
                System.out.println("in " + date + " 31 days");
                break;
            case "August":
                System.out.println("in " + date + " 31 days");
                break;
            case "September":
                System.out.println("in " + date + " 30 days");
                break;
            case "October":
                System.out.println("in " + date + " 31 days");
                break;
            case "November":
                System.out.println("in " + date + " 30 days");
                break;
            case "December":
                System.out.println("in " + date + " 31 days");
                break;
        }
    }


}
