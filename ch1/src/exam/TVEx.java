package exam;

public class TVEx {
    public static void main(String[] args) {
        //객체 생성->메소드 호출
        //this.speaker is null error 가 뜬 다면 new speaker을 안 한 것이다.
        // 그래서 setter 나 생성자가 필요하다.
        // TV tv = new LgTV(); defaut 생성자 삭제, 인자로 speaker 하나 넘겨야함
        // TV tv = new LgTV(new AppleSpeaker()); 로 생성자를 이용하거나
        LgTV tv = new LgTV();
        tv.setSpeaker(new AppleSpeaker());
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
    }
}
