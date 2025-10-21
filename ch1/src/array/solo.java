package array;

public class solo {
    public static void main(String[] args) {
        int[][] score = {
                { 90, 85 }, // 1번 학생 (국어, 수학)
                { 70, 60 }, // 2번 학생
                { 95, 100 }, // 3번 학생
                { 80, 75 } // 4번 학생
        };
        int korTotal = 0, mathTotal = 0;
        float korAvg = 0.0f, mathAvg = 0.0f;

        System.out.println("번호    국어     수학    총점    평균");
        System.out.println("======================================");
        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            float avg = 0.0f;
            korTotal += score[i][0];
            mathTotal += score[i][1];

            System.out.printf("%2d", i + 1);
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);

            }
            avg = sum / (float) score[i].length;
            System.out.printf("%5d %5.1f", sum, avg);
            System.out.println();
        }
        korAvg = korTotal / (float) score.length;
        mathAvg = mathTotal / (float) score.length;
        System.out.println("=====================================");
        System.out.printf("과목당 총점 : %6d %6d\n", korTotal, mathTotal);
        System.out.printf("과목당 평균 : %6.1f %6.1f", korAvg, mathAvg);
    }
}
