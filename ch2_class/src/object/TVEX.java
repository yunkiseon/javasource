package object;

public class TVEX {
    public static void main(String[] args) {
        // tv 클래스의 인스턴스 생성
        TV tv = new TV();
        System.out.println(tv);// object.TV@5ca881b5, 메모리주소가 나옴 때문에 TV.java에서
        // 문자열을 반환하는 메소드가 필요함->source action-> Generatic toString 하면 됨
        // TV [size=0, channel=0, power=false, color=null]
        // 정수형 : 0, 실수형 : 0.0, 논리형 : flase, 문자형 : 빈문자, String : null

        // 초기화
        // tv.power = true;
        tv.setPower(true);// TV.java 안 boolean power라는 변수에 대입된다

        // tv.size = 48;
        tv.setSize(48);
        // tv.channel = 3;
        tv.setChannel(3);
        // tv.color = "black";
        tv.setColor("black");

        System.out.println(tv);// TV [size=48, channel=3, power=true, color=black]

        TV tv2 = new TV();
        tv2.setPower(true);
        tv2.setChannel(7);
        tv2.setColor("white");
        tv2.setSize(40);

        // 채널+
        tv2.channelUp();

        System.out.println(tv2);

    }
}
