package util;

import java.util.Arrays;

//public static <T,U> T[] copyOf(U[] original, int newLength,Class<? extends T[]> newType) -> T, K, V, E -> 객체(참조타입)를 의미.
// 배열을 복사하여 새로운 배열로 리턴한다는 의미. copyofT[student] 라고 하면 T를 새로운 student로 해석하면 된다
// java.utll.Array : 배열을 조작하기 쉽게 다양한 메소드 제공
public class ArrayEx1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        int[] newArr = new int[7];
        // 배열 복사 방법?
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        System.arraycopy(arr, 0, newArr, 0, 0);
        // arrys 엔 정렬과 검색 기능이 있다.
        int[] copyaArr = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(copyaArr));

        int[] copyaArr2 = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(copyaArr2));

    }
}
