public class SavingAccountEx6 {
    private double balance,interest_rate;
    public SavingAccountEx6(){
        balance=1000;}
    public void addInterest(double interest_rate)
    {balance=(balance*interest_rate)+balance;}
    public double getBalance() {
        return balance;
    }
    public double getInterest_rate() {
        return interest_rate;
    }
}
