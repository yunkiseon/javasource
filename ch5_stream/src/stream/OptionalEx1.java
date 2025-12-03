package stream;

import java.util.Optional;

public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<String> optVal = Optional.of("abc");
        if (optVal.isPresent()) {
            optVal.get();
        }


        String str1 = optVal.get();
        //값이 없을 경우에 공백을 넣어줘
        String str2 = optVal.orElse("");//아래와의 차이는 orElse는 항상 실행, orElseGet은 없을 때만 실행, 
        // 그리고 매서드 호출하며 객체생성한다는 차이점이 있다.
        String str3 = optVal.orElseGet(String::new);//Supplier<? extends String> supplier
        String str4 = optVal.orElseThrow();// 없으면 날려라. get과 동일해짐 아래와의 차이점은 
        // 지정한 예외에서만 발생하고 커스터마이징이 가능한 아래와 다르다는 점이다.
        String str5 = optVal.orElseThrow(NullPointerException::new);
    }
}
