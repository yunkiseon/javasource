package inheritance;

public class TvEx {
    public static void main(String[] args) {
        // 상속 관계에 있을 때 인스턴스 생성 가능
        CaptionTv ctv = new CaptionTv(48, 7, false, "black");
        // TV tv = new CaptionTv(0, 0, false, null);//TV를 부르고 CaptionrTv를 부를 수 있는 이유는
        // 상속이여서 그렇다

        // 자식 클래스에서 사용 가능한 것
        // 1. 부모의 멤버변수
        ctv.channel = 8;
        // 2. 부모의 메소드
        ctv.setPower(true);
        // 3. 자식의 멤버변수 및 메소드
        ctv.displayCaption("자막 사용 가능");

    }
}
