
public class TallyEx1 {
    private int value;
    public TallyEx1() {value = 0;}
    public void click() {value = value + 1;}
    public void undo() {value = value - 1;}
    public int getValue() {
        return Math.max(value,0);}
    }
