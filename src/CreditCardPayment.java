public class CreditCardPayment implements IPaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплата банковской картой на сумму: " + amount + " рублей.");
    }
}