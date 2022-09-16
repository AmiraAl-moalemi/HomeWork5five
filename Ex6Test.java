public class Ex6Test {
    public static void main(String[] args) {
        SavingAccountEx6 c=new SavingAccountEx6();
        System.out.println("the balance= "+c.getBalance());
        c.addInterest(0.10);
        System.out.println("the expected result:= "+(1000+(1000*0.10)));
        System.out.println("the result:"+c.getBalance());

    }
}
