public class TimDepositAccountEx7 {
    public double balance;
    public TimDepositAccountEx7( double initialBalnce){balance=initialBalnce;}
    public void addRate(double rate){balance=balance+(balance*rate);}
    public void withdraw(double amount ){balance=balance-balance;}
    //or public void withdraw (){balance=0}
    public double getBalance(){return balance;}
}
