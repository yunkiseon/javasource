package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        // 45개의 정수값을 저장하기 위한 배열 생성
        // 각요소에 1 ~ 45 값 저장
        // 배열의 0번째에서 5번째 요소까지
        // 모두 6개만 교환
        // 교환위치 : 0~ 44 무작위 수
        // i, 교환위치 출력
        int[] arr = new int[45];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < 6; i++) {
            int num = (int) (Math.random() * 44);
            int temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }
        for (int i = 0; i < 6; i++) {
            System.out.printf("arr%d = %d\n", i, arr[i]);
        }
    }
}
