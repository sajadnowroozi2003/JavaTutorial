package Day_24.PaymentSystem;

public class Cash extends  Payment{
    @Override
    void pay() {
        System.out.println("this is Cash pay");
    }
}
