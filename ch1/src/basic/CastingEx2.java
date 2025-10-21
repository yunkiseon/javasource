package basic;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 91234567;
        float f = i;
        int i2 = (int) f;

        double d = i; // 자동 형변환
        int i3 = (int) d;
        System.out.println(i2 + i3);
        // 타입들 중 boolean 제외하고 형변환가능
    }
}
