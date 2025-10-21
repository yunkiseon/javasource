package util;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        // 1 ~ 45 -> 6 개 숫자를 무작위로 추출 (로또)
        // Math.random, set(중복방지)
        Set<Integer> set = new HashSet<>();// int 는 안됨, 객체타입인 Integer
        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);

        }
        System.out.println(set);

        // Collections.sort(set);// Collections는 list만 받음 so, set-> list 방법이 있어야 함
        List<Integer> list = new LinkedList<>(set);
        // 정렬
        Collections.sort(list);
        System.out.println(list);

        // Collections.sort();
        // Comparator

        // 반대로 list를 set으로
        Set<Integer> set2 = new HashSet<>(list);
        System.out.println(set2);
    }

}
