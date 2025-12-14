package Day_32.Exam2024.Oppgava2;

public class Main {
    public static void main(String[] args) {

        System.out.println(dividNumbers("10","4"));
    }


    private static double dividNumbers(String numerator , String denominator){
    double num1= Double.parseDouble(numerator);
    double num2= Double.parseDouble(denominator);

    if (num1>0 && num2>0){
        double total = num1/num2;
        return total;
    }else {
        System.out.println("Invalid number . plz enter grader than 0");
        return -1;
    }


    }
}
