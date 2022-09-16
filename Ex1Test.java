public class Ex1Test {
    public static void main(String[] args) {
        TallyEx1 x=new TallyEx1();
        System.out.println("value="+x.getValue());
        x.click();x.click();
        x.click();x.click();
        System.out.println("add 4 button ="+x.getValue());
        x.undo();x.undo();x.undo();
        System.out.println("after 3 undo="+x.getValue());
        x.undo();x.undo();x.undo();x.undo();x.undo();x.undo();
        System.out.println("after undo more zero ="+x.getValue());
    }
}
