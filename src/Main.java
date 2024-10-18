

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Оплата банковской картой
        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(1000);

        // Оплата через PayPal
        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(2000);

        // Оплата криптовалютой
        context.setPaymentStrategy(new CryptoPayment());
        context.executePayment(3000);
    }
}
