package object;

public class DataEx {
    public static void main(String[] args) {
        Data data = new Data();
        data.x = 10;
        change(data.x);// 값만 넘어감
        System.out.println("chage 호출 후 : " + data.x);
        change(data);
        System.out.println("change(Data d) 호출 후 : " + data.x);
        Data data2 = copy(data);
        System.out.println("data2.x = " + data2.x);

    }

    public static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;// 주소 리턴가능-> 참조형들은 모두 주소리터임
    }

    public static void change(Data d) {
        d.x = 15;
        System.out.println("변경 후 : " + d.x);
    }

    public static void change(int x) {
        x = 15;
        System.out.println("변경 후 : " + x);
    }
}
