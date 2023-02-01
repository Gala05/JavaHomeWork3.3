public class CreditPaymentService {
    public double calculate(int creditAmount, int creditPeriod, double interestRate) {
        double monthlyInterestRate = interestRate / 100 / 12; //ежемесячная процентная ставка
        double result1 = Math.pow((1+monthlyInterestRate), creditPeriod); //промежуточные вычисления
        double result2 = monthlyInterestRate / (result1-1); //промежуточные вычисления
        double result = creditAmount * (monthlyInterestRate + result2);
        return result;
    }
}
