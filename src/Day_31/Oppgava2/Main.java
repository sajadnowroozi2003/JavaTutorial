package Day_31.Oppgava2;

public class Main {
    public static void main(String[] args) {

        System.out.println(MonthName(2));
        System.out.println(MonthName(3));
        System.out.println(MonthName(7));
        System.out.println(MonthName(22));

    }



    public static String MonthName(int month){
        switch (month) {
            case 1:
                return "Jan";
            case 2:
                return "Fab";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "Jul";
            case 8:
                return "Aug";
            default:
                return "Invalid number";

        }
    }
}
