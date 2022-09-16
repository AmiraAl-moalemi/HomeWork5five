public class Ex7Test {
    public static void main(String[] args) {
        TimDepositAccountEx7 c=new TimDepositAccountEx7(1000);
        System.out.println("the balance="+c.getBalance());
        c.addRate(10);
        System.out.println("the balance with rate:"+c.getBalance());
        c.withdraw(500);//withdrawals not allowed.
        System.out.println("the balance after withdraw= "+c.getBalance());

    }
}
