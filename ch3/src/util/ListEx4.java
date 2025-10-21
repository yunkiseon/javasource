package util;

import java.util.LinkedList;
import java.util.List;

public class ListEx4 {
    // Arraylist 는 하나의 공간에 20개의 칸이 있어야만 20개의 데이터를 저장할 수 있다면
    // LinkedList는 20개의 공간이 파편화되어있어도 Link로 연결되어있어서 괜찮다.
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        // 추가
        list.add("사과");
        list.add("귤");
        list.add("수박");
        list.add("멜론");
        list.add("키위");
        list.add("배");
        list.add("감");

        System.out.println(list);

        // 삭제
        list.remove(2);
        System.out.println(list);

        // 수정
        list.set(0, "포도");
        System.out.println(list);

        // 조회
        System.out.println(list.get(3));
        for (String str : list) {
            System.out.println(str);
        }
    }
}
