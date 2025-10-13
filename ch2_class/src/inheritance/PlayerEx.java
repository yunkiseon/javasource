package inheritance;

public class PlayerEx {
    public static void main(String[] args) {
        Player player = new CDPlayer();// 부모 것으로 부르면 부모가 가진 것으로만 제한 된다.
        CDPlayer cdPlayer = new CDPlayer();

        player.pause = true;
        player.currentPos = 7;
        // 다형성 : 오버라이딩 시 자식 클래스의 메소드가 실행됨
        player.play(8);
        player.stop();

        cdPlayer.currentPos = 8;
        cdPlayer.pause = false;
        cdPlayer.currentTrack = 9;
        cdPlayer.play(1);
        cdPlayer.nextTrack();
    }
}
