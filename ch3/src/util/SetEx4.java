package util;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);

        }
        System.out.println(set);

        Set<Integer> set2 = new TreeSet<>();// 이진검색트리 자료구조 형태로 데이터 저장, 정렬된 위치에 저장, 정렬, 검색, 범위 검색 높은 성능
        for (int i = 0; set2.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set2.add(num);
        }
        System.out.println(set2);
    }
}
