public class RewardValue {
    private double cashValue;
    private double milesValue;
    private double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue() {
        this.milesValue = cashValue / conversionRate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
