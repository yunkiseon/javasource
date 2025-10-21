package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        // 'a', 'b', 'c', 'd' 을 담고 싶다.
        char[] arr1 = { 'a', 'b', 'c', 'd' };
        // 99.8, 85.2, 77.8, 63.8
        double[] arr2 = { 99.8, 85.2, 77.8, 63.8 };
        // "bear", "snow", "sun"
        String[] arr3 = { "bear", "snow", "sun" };

        // 1 ~ 10 임의의 수를 생성 후 초기화

        int[] arr4 = new int[10];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (int) (Math.random() * 10) + 1;
        }

        // 배열 길이가 명확하지 않는 경우 -> 입력값으로 결정

        int[] arr5;
        Scanner sc = new Scanner(System.in);
        System.out.println("배열 길이 입력 ");
        int length = sc.nextInt();
        arr5 = new int[length];

        // 배열 출력
        // Arrays.toString()
        System.out.println(Arrays.toString(arr1));// abcd -> 문자만 출력가능
        System.out.println(Arrays.toString(arr2));// [D@6d03e736
        System.out.println(Arrays.toString(arr3));// [Ljava.lang.String;@568db2f2
        System.out.println(Arrays.toString(arr4));// [I@378bf509
        System.out.println(Arrays.toString(arr5));// [I@5fd0d5ae

        // for 출력
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        // 향상된 for문
        for (String str : arr3) {
            System.out.println(str);
        }
        for (char ch : arr1) {
            System.out.println(ch);
        }
        sc.close();
    }
}
