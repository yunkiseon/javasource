package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("감");
        list.add("포도");
        list.add("바나나");
        // for (String string : list) {
        //     System.out.println(string);
        // }

        // 정렬 후 출력
        // list.sort(Comparator.naturalOrder());
        // System.out.println(list); // 원본 정렬해버림
        // System.out.println();

        String[] strArr = {"사과", "배", "감"};
        // 이 배열을 list로 바꾸고 싶다면
        // List<String> list2 = Arrays.asList(strArr);
        // 정렬 후 출력
        // Arrays.sort(strArr);
        // System.out.println(Arrays.toString(strArr));// 원본 정렬되어버림
        // System.out.println();
    
        // 리스트를 스트림으로 변경
        System.out.println("스트림처리");
        Stream<String> stream1 = list.stream();
        // 배경을 stream 읋 뵨굥
        Stream<String> stream2 = Arrays.stream(strArr);
        
        //Consumer<? super String> action -> consumer의 경우 String이나 Object로 받아야한다.
        //consumer 가 받을 수 있는 람다 식으로 받으면 된다.
        // 원본 변경없음
        stream1.sorted().forEach((x)->System.out.println(x));
        stream2.sorted().forEach((x)->System.out.println(x));
        System.out.println(list);
        System.out.println(Arrays.toString(strArr));
    }

}
