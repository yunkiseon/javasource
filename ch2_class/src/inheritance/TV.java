package inheritance;

public class TV {
    // 속성 : 크기(52), 채널(7), 파워(true/false), tv 프레임의 색상(black)
    int size;
    int channel;
    boolean power;
    String color;

    // 생성자

    // 기능(메소드) : 채널변경, 전원여부, 볼륨조절

    // 문자열 반환하는 메소드
    @Override
    public String toString() {
        return "TV [size=" + size + ", channel=" + channel + ", power=" + power + ", color=" + color + "]";
    }

    public TV(int size, int channel, boolean power, String color) {
        this.size = size;
        this.channel = channel;
        this.power = power;
        this.color = color;
    }

    // setter 메소드, 기능들을 설정하기 위한 메소드
    public void setSize(int size) {
        this.size = size;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setPower(boolean power) { // void라 리턴 없다.
        this.power = power; // (변수) {} 안의 우측 power은 변수 boolean power 의미, this power는 현재 클래스의 power 의미
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void channelUp() {
        ++this.channel;
    }

    public void channelDown() {
        --this.channel;
    }

    public int getSize() {
        return size;
    }

    public int getChannel() {
        return channel;
    }

    public boolean isPower() {// boolean 타입은 is로 시작
        return power;
    }

    public String getColor() {
        return color;
    }

}
