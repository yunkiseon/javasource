package lang;

// 래퍼 클래스
// 기본타입 변수를 객체로 다루고자 할 때 사용
public class WrapperEx {
    public static void main(String[] args) {
        // boolean -> Boolean
        boolean b = true;
        // Boolean boolean1 = new Boolean(b); // 취소선있다는 건 지금은 지원안한다는 것
        Boolean boolean1 = Boolean.valueOf(b);
        Boolean boolean2 = false;// 자동으로 Boolean.valueOf(false)로 자동변환된 것이다.

        // byte -> Byte
        Byte byte1 = 1; // Byte.valueOf((byte) 1) 자동변환
        // 1 -> int 형으로 인식
        Byte byte2 = Byte.valueOf((byte) 1);
        // char -> CHAR
        Character ch = 'a';
        // short -> Short
        // int ->Integer
        Integer.parseInt("15");
        // long -> Long
        Long long1 = 15L;
        Long.parseLong("15.5");// long
        // float -> Float
        Float float1 = 16.5f;
        Float.parseFloat("16.58");
        // double -> Double
        Double double1 = 18.5d;
        Double.parseDouble("172.56");

    }
}
