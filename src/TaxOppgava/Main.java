package TaxOppgava;

public class Main {
    public static void main(String[] args) {
        System.out.println("Your tax is :"+  Tax.calculateTax(150_000_000));
        System.out.println("Your tax is :"+  Tax.calculateTax(100_000));
        System.out.println("_________calculateTaxForRetired_________");
        System.out.println(Tax.calculateTaxForRetired(217_350));
        System.out.println(Tax.calculateTaxForRetired(217_850));
        System.out.printf("%.2f",Tax.calculateTaxForRetired(697_250));
        System.out.println();
        System.out.printf("%.2f",Tax.calculateTaxForRetired(1_420_750));
    }
}
