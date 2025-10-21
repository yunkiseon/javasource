package lombok2;

import lombok.*;
@EqualsAndHashCode // equals(), hashCode()
@AllArgsConstructor// 멤버변수 사용한 생성자
@NoArgsConstructor// 기본생성자
@Setter
@Getter
@ToString
@Builder
public class Account {
private String name;
private String accNo;
private int balance;
    //생성자, getter, setter, toString() -> 애너테이션 처리
    // equals, hashCode, builder 등... 
}
