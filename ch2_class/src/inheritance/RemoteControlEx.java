package inheritance;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc = new Television();

        rc.turnON();
        rc.setVolune(5);
        rc.setMute(true);
        rc.setVolune(15);
        rc.turnOff();

        rc = new Audio();

        rc.turnON();
        rc.setVolune(7);
        RemoteControl.changeBattery();
        rc.setVolune(9);

        // 익명 클래스 - > 1회용
        rc = new RemoteControl() {
            private int volume;

            @Override
            public void turnON() {
                System.out.println("Radio 를 킵니다");
            }

            @Override
            public void turnOff() {
                System.out.println("Radio 를 끕니다");
            }

            @Override
            public void setVolune(int volume) {
                if (volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                } else if (volume < RemoteControl.MIN_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                } else {
                    this.volume = volume;
                }
                System.out.println("현재 Radio 볼륨 : " + this.volume);
            }

        };
        rc.turnON();
        rc.setVolune(8);
        rc.setMute(true);
        rc.turnOff();
    }
}
