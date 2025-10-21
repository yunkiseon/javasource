package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        // String[] str1 = {""}; 하듯이,
        List<String> list1 = new ArrayList<>();
        // 추가 add -> append 개념
        list1.add("사과");
        list1.add("귤");
        list1.add("수박");
        list1.add("멜론");
        list1.add("키위");
        list1.add("배");
        list1.add("감");
        System.out.println(list1);// [사과, 귤, 수박, 멜론, 키위, 배, 감]
        System.out.println(list1.get(3));// 멜론

        System.out.println("list 요소 수" + list1.size());// 7

        list1.remove(0);
        System.out.println(list1);// [귤, 수박, 멜론, 키위, 배, 감]
        list1.remove("수박");
        System.out.println(list1);// [귤, 멜론, 키위, 배, 감]

        // 특정위치 요소값 변경
        list1.set(0, "포도");
        System.out.println(list1);// [포도, 멜론, 키위, 배, 감]

        // insert 개념
        list1.add(2, "딸기");
        System.out.println(list1);// [포도, 멜론, 딸기, 키위, 배, 감]

        for (String string : list1) {
            System.out.println(string);
        }
        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);
    }
}
