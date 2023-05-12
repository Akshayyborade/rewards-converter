public class RewardValue {
    private int cashValue;
    private double milesValue;
     public RewardValue(int cashValue){
          this.cashValue=cashValue;
     }
     public RewardValue(double milesValue){
          this.milesValue=milesValue;
     }
     public int getCashValue(){
        return cashValue;
        }
        public double getMilesValue(){
            return milesValue;
            }
}

