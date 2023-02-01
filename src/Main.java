public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmount = 1_000_000;
        int creditPeriod = 12;
        double interestRate = 9.99;
        double monthlyPayment = service.calculate(creditAmount, creditPeriod, interestRate);
        System.out.println();
        System.out.println("Кредит 1 000 000 рублей на 12 месяцев под 9.99% годовых");
        System.out.println("Ежемесячный платеж: " + service.calculate(1_000_000, 12, 9.99));
        System.out.println();
        System.out.println("Кредит 1 000 000 рублей на 24 месяца под 9.99% годовых");
        System.out.println("Ежемесячный платеж: " + service.calculate(1_000_000, 24, 9.99));
        System.out.println();
        System.out.println("Кредит 1 000 000 рублей на 36 месяцев под 9.99% годовых");
        System.out.println("Ежемесячный платеж: " + service.calculate(1_000_000, 36, 9.99));
    }
}