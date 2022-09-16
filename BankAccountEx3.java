public class BankAccountEx3 {
    private double balance;
  //  public BankAccountEx3(){balance=0;}
  public BankAccountEx3(double initialBalance){balance=initialBalance;}
    public void deposits(double payment ){balance=balance+payment;}
    public void withdraws(double amount){balance=balance-amount;}
    public double getBalance(){return balance;}
/////////////////////////////////////////////////Ex4
    public void addInterest(double rate){
        balance=balance+(balance*rate);
    }
    ////////////////////////////////////////////////////////////////////

}

