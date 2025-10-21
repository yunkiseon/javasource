package util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx3 {
    public static void main(String[] args) {
        // int[] arr = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };
        Integer[] arr = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };
        // 정렬 -> 선택정력, 버블정렬, 퀵정렬...

        Arrays.sort(arr);// ascending이 기본값
        System.out.println("오름차순 정렬 후");
        System.out.println(Arrays.toString(arr));

        // 내림차순 정렬
        // Arrays.sort(T[] a, Comparator<? super T> c)
        Arrays.sort(arr, Comparator.reverseOrder());// sort를 객체타입(참조타입)으로 바꾸어주어야함 Integer 해주어야한다는 뜻.
        System.out.println("내림차순 정렬 후");
        System.out.println(Arrays.toString(arr));

        String[] arr2 = { "good", "height", "dog", "lion", "cat", "zero", "zoo" };
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr2));
    }
}
