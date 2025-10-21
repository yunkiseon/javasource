package lang;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // obj Value 의 instance 여부 확인 후 형변환해야한다. 에러가 날 수도 있기 때문이다.
        if (obj instanceof Value) {
            Value v = (Value) obj;
            if (this.value == v.value) {
                return true;
            }
        }
        return false;

    }
    // String -> int : Integer.parseInt("65")
    // int 를 String 으로 바꾸는 바꾸는 방법 ""붙이기
    // @Override
    // public String toString() {

    // return this.value + "";
    // }
    @Override
    public String toString() {
        return "Value [value=" + value + "]";
    }

}
