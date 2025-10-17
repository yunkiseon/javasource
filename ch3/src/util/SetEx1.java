package util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        // 추가 : add 같은 블럭 컨 알 화살표, set 구조는 중복요소 저장 x, 차례대로 저장 x
        // [배, 감, 멜론, 귤, 수박, 사과, 키위]
        // i 지정자체를 못하기에 수정도 안됨

        set1.add("사과");
        set1.add("귤");
        set1.add("수박");
        set1.add("멜론");
        set1.add("키위");
        set1.add("배");
        set1.add("감");
        set1.add("감");
        System.out.println(set1);

        // 삭제 : remove
        set1.remove("수박");
        System.out.println(set1);

        // 수정 x, 수정삽입x
        // set1.set() - > x

        // 전체 조회
        for (String str : set1) {
            System.out.println(str);
        }
        // i가 없어서 get 못씀 그래서 특정조회하려면
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {// hasNext -> 다음에 가져올 것이 있으면 true, 없으면 false
            String str = iterator.next();
            System.out.println(str);
        }

        // LinkedHashset -> 저장순서를 유지해줌
        //
    }
}
