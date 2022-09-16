
public class Ex2Test {
    public static void main(String[] args) {
        CounterEx2 c=new CounterEx2();
        System.out.println("the people:"+c.getValue());
        c.setPeople(2);
        System.out.println("the 2 people:"+c.getValue());
        c.setPeople(7);
        System.out.println("the 2+7 people:"+c.getValue());
        c.setPeople(11);
        System.out.println("the 11 people and the maximum 10: "+c.getValue());
        c.setPeople(20);
        System.out.println("the 20 people and maximum10:"+c.getValue());
        c.setPeople(9);
        System.out.println("the 9 people and maximum10:"+c.getValue());
    }
}
