package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        // 리스트를 생성
        List<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        List<String> list3 = List.of("사과", "포도", "딸기", "수박");
        List<String> list6 = new ArrayList<>(List.of("사과", "포도", "딸기", "수박"));
        String[] fruits = { "사과", "포도", "딸기", "수박" };
        List<String> list4 = Arrays.asList(fruits);

        list1.add("사과");
        list2.add("사과");
        // list3.add("바나나");
        // list4.add("바나나");// UnsupportedOperationException -> 변경이 안되는 것인데 변경 시도
        // list4.remove(0);// 도 안됨. 배열의 속성을 가지고 있기 때문이다.
        String[] fruits2 = { "사과", "포도", "딸기", "수박" };
        List<String> list5 = new ArrayList<>(Arrays.asList(fruits2));
        list5.add("바나나");// 이건 된다.
        list6.add("바나나");

    }
}
