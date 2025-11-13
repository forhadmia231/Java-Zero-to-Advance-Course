public class paypal implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Paid $" + amount + " using PayPal.");
        }
    }