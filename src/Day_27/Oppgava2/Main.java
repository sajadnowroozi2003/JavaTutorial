package Day_27.Oppgava2;

public class Main {
    public static void main(String[] args) {

        System.out.println(getMonthName(3));
        System.out.println(getMonthName(5));
        System.out.println(getMonthName(11));
        System.out.println(getMonthName(6));
        System.out.println(getMonthName(61));
    }


    public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "january";

            case 2:
                return "feb";

            case 3:
                return "Mar";

            case 4:
                return "Apr";

            case 5:
                return "May";

            case 6:
                return "Jun";

            case 7:
                return "Juli";

            case 8:
                return
                        "Aug";

            case 9:
                return "Sep";

            case 10:
                return "Oct";


            case 11:
                return "Nav";

            case 12:
                return "Dec";

            default:
                return "Invalid number";

        }
    }
}
