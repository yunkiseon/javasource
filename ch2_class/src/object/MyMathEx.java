package object;

public class MyMathEx {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        // 메소드 호출
        // 1) 변수에 받기
        long result = myMath.add(12, 63);// 이렇게 수를 삽입하면 MyMath의 add 들어가서 return되어 돌아온다
        System.out.println("덧셈결과 : " + result);
        result = myMath.substract(85, 35);
        System.out.println("뺄셈결과 : " + result);
        result = myMath.multiply(25, 17);
        System.out.println("곱셈결과 : " + result);
        double result2 = myMath.divide(55, 11);
        System.out.println("나눗셈결과 : " + result2);

        // 2) 출력문

    }
}
