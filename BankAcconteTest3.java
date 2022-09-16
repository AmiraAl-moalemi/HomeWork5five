public class BankAcconteTest3 {
    public static void main(String[] args) {
        BankAccountEx3 b=new BankAccountEx3(0);
        System.out.println(" balance : "+b.getBalance());
        b.deposits(1000);
        b.withdraws(500);
        b.withdraws(400);
        System.out.println(" expected balance =  "+b.getBalance());
        System.out.println("actual balance =      "+((1000-500)-400));
    }
}
