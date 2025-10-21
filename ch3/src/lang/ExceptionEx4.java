package lang;

// 다중 catch 구문
public class ExceptionEx4 {
    public static void main(String[] args) {
        try {
            // exception 이 발생할 가능성이 있는 코드 작성
            String data2 = args[0];
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
        } catch (NumberFormatException e) {
            System.out.println("입력값 확인");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인자 확인");
        } catch (Exception e) {// 부모는 맨 아래로
            // 하나하나 trycatch 잡아도 되긴 함
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 재실행");
        }

    }
}
