public class PaymentFactory {
    public static Payment getPayment(String type) {
        if (type == null) {
            return null;
        }
        while(Exit) {

            switch (type.toLowerCase()) {
                case "creditcard":
                    return new creditcard();
                case "paypal":
                    return new paypal();
                case "banktransfer":
                    return new BankTransfer();
                default:
                    System.out.println("Invalid payment type: " + type);
                    return null;
            }
        }
    }
}
