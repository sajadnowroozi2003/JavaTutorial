package Day_19;

public class Main {
    public static void main(String[] args) {

        Valutakalkulator k = new Valutakalkulator();
        System.out.println("100 NOK to AFG = "+String.format("%.2f",k.beregnkurs("afg")) );
        System.out.println("100 NOK to USD = "+String.format("%.2f",k.beregnkurs("usd")) );
        System.out.println("100 NOK to SEK = "+String.format("%.2f",k.beregnkurs("sek")) );

    }
}
