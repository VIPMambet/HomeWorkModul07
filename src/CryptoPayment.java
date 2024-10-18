public class CryptoPayment implements IPaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Оплата криптовалютой на сумму: " + amount + " рублей.");
    }
}