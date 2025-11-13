import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter payment method (CreditCard / PayPal / BankTransfer): ");
        String method = scanner.nextLine();

        System.out.print("Enter amount to pay: ");
        double amount = scanner.nextDouble();

        Payment payment = PaymentFactory.getPayment(method);

        if (payment != null) {
            payment.pay(amount);
        } else {
            System.out.println("Payment failed. Invalid payment method.");
        }

        scanner.close();
    }
}
