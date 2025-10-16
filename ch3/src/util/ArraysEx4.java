package util;

import java.util.Arrays;

public class ArraysEx4 {
    public static void main(String[] args) {
        int[] arr = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };
        // Integer[] arr = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };

        // 검색
        // 1. 순차검색
        // 2. 이진검색
        Arrays.sort(arr);
        int pos = Arrays.binarySearch(arr, 62);
        System.out.println("62는 " + (pos + 1) + "번째 위치함");// 정렬안하거나 없는 수라면 이상한 수가 출력된다
    }
}
