public class CounterEx2 {
    private int people;
    public CounterEx2(){people=0;}
    public void setPeople (int m){
        people=people+m;}
    public int getValue(){
        return Math.min(people,10);
    }
}

