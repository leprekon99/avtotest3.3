public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int period = 12;
        int amount = 1000000;
        double rate = 9.99;
        int payment = service.calculate(period, amount, rate);
        System.out.println(payment);
    }
}