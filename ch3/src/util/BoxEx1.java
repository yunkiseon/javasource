package util;

public class BoxEx1 {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        box1.setItem("홍길동");// 내부에 new String("홍길동") 으로 저장
        String name = (String) box1.getItem();
        System.out.println(name);
        box1.setItem(33);// Integer.valueOf(33)
        Integer i = (Integer) box1.getItem();
        box1.setItem(33.14);// Double.valieOf(33.14)
        Double d = (Double) box1.getItem();
        // 모두 받을 수 있는 형태로 만들면 넣을 때도 위와 같이 타입변환해서 넣고, 뺄 때도 타입변환해서 빼야한다.
        // 데이터를 넣을 때 타입지정해서 받자, 그러면 위와 같이할 필요가 없다. -> 지네릭스의 기본

        Box2<String> box2 = new Box2<>();// 이렇게 하면 컴파일 단계에서바로 타입체크가 되기때문에 안정적이다
        box2.setItem(name);
        String data = box2.getItem();

    }
}
