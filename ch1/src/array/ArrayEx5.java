package array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 10개의 정수를 담는 배열 선언
        // 각 요소는 0~9 숫자로 초기화

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        // System.out.println(Arrays.toString(arr));
        // java에서 숫자를 바꾸려면?
        // int x = 10, y = 5;
        // int temp = x;
        // x = y;
        // y = temp;
        // x -> y, y -> x 값 교환
        int num = 0;
        for (int i = 0; i < 100; i++) { // 0 ~ 9 사이의 임의의 수 추출,
            num = (int) (Math.random() * 10);
            int temp = arr[0];
            arr[0] = arr[num];
            arr[num] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
