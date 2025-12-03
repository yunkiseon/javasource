package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        String[] strArr = {"사과", "바나나", "딸기", "포도", "메론"};
        // java.util.Arrays : 배열과 관련된 기능 제공
        // Arrays.toString(strArr): 배열값 출력
        // Arrays.asList(null): 배열을 리스트로 변경
        // Arrays.sort(strArr) : 정렬
        Stream<String> stream = Arrays.stream(strArr);
        // System.out.println(stream/); 스트림 자체를 sout 하진 않음
        stream.forEach((s)->System.out.println(s));
        // stream.forEach(System.out::println); 지금은 안됨 이유: 스트림을 한 번 사용해서

        List<String> list = Arrays.asList("사과","바나나", "딸기", "포도", "메론");
        // list.add("수박"); Exception in thread "main" java.lang.UnsupportedOperationException 이 방법은 추가가 안됨. 배열을 리스트로 만든 것이라 배열의 특성을 가져가서 그렇다
        Stream<String> stream2 = list.stream();
        stream2.forEach(System.out::println);
        // List.of(E...elements) : 인수의 개수를 자유롭게 해도 된다.
        List<String> list2 = List.of("사과", "바나나", "딸기", "포도", "메론");
        // list2.add("수박") 추가 안됨. 
        Stream<String> stream3 = Stream.of("사과", "바나나", "딸기", "포도", "메론"); //처음부터 stream으로 생성

        // 숫자범위로 스트림 생성
        IntStream.range(1, 10).forEach(System.out::println);// 1~9
        IntStream.rangeClosed(1, 10).forEach(System.out::println);// 1~10


    }
}
