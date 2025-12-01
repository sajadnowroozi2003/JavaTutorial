package Day_24.PaymentSystem;

public class Main {
    public static void main(String[] args) {
        Payment p1 =new Visa();
        Payment p2 =new PayPal();
        Payment p3 =new Cash();

        p1.pay();
        p2.pay();
        p3.pay();
    }
}
