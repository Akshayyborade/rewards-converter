public class RewardValue {
    private double cashValue;
    private double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
       
    }

    public RewardValue(int milesValue) {
       
        this.cashValue = convertMilesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return convertCashToMiles(this.cashValue);
    }

    double convertCashToMiles(double cashValue) {
        return(int) (cashValue / conversionRate);
    }

    double convertMilesToCash(double milesValue) {
        return milesValue * conversionRate;
    }
}

