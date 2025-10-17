package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();// 전자는 Key 타입, 후자는 Value 타입

        // 추가
        map.put("1", "사과");
        map.put("2", "포도");
        map.put("3", "귤");
        map.put("4", "수박");

        // 조회 -> key 값을 이용해서 value 조회
        String value = map.get("1");
        System.out.println(value);// 사과

        // 전체조회 -> 향상된 for문(foreach) x
        // key 값을 iterator 구조로 변경
        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();

        while (iter.hasNext()) {
            String key = iter.next();
            value = map.get(key);
            System.out.println(key + ":" + value);

        }
    }
}
