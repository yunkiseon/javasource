package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 배열(array) - 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
        // 타입 배열명[] = new 타입[10]; -> 배열 선언과 생성한다
        // 타입 : 기본형(int, long, float, double, boolean, char), 참조형(기본형이 아닌 모든 것. String)
        // 시험점수 저장, 10 명
        // int score1 = 0, score2 = 0, score3 = 0; //...해서 score10 까지 하고 점수 입력해야 함
        // //평균내고 싶으면
        // int sum = score1 + score2 +score3;//...해서 score10 까지 한 뒤
        // double avg = (double)sum / 10;
        // 정수형
        int[] arr1 = new int[10];
        System.out.println(arr1[3]);
        // 실수형
        double[] arr2 = new double[5];
        System.out.println(arr2[0]);
        // 논리형
        boolean[] arr3 = new boolean[3];
        System.out.println(arr3[1]);
        // 문자형
        char[] arr4 = new char[3];
        System.out.println(arr4[0] + "arr");

        // int[] arr5;//선언
        // arr5 = new int[3]; 배열 생성

        // 초기화
        // arr1[0] = 88, arr1[1] = 90, arr1[2] = 87; 하기 번거로움
        int score[] = { 88, 90, 87, 86, 77, 78, 79, 75, 72, 66 };
        // int sum = score[0] + score [1] + ......+ score[9];
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + sum / score.length);
    }
}
