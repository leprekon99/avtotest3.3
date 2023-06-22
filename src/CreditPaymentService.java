public class CreditPaymentService {
    public CreditPaymentService() {
    }

    public int calculate(int period, int amount, double rate) {
        double monthRate = rate / (double) period / 100.0;
        double koeficient = monthRate * Math.pow(1.0 + monthRate, (double) period) / (Math.pow(1.0 + monthRate, (double) period) - 1.0);
        double payment = koeficient * (double) amount;
        return (int) payment;
    }
}
