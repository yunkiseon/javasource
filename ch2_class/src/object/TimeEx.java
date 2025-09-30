package object;

public class TimeEx {
    public static void main(String[] args) {
        Time time = new Time();
        // 시, 분, 초 지정하고 싶다.
        time.setHour(12);
        time.setMinute(45);
        time.setSecond(30);
        System.out.println(time.getHour() + " : " + time.getMinute() + " : " + time.getSecond());
    }
}
