public class Ex4Test {
    public static void main(String[] args) {
        BankAccountEx3 momsSaving=new BankAccountEx3(1000);
        System.out.println(" balance : "+momsSaving.getBalance());
      //  momsSaving.deposits(1000);
        System.out.println(" expected balance =  "+momsSaving.getBalance());
        System.out.println("actual balance =      "+(1000));
        momsSaving.addInterest(10);
        System.out.println(" expected rate balance =  "+momsSaving.getBalance());
        System.out.println("actual rate balance =      "+((1000*10)+1000));
}}
