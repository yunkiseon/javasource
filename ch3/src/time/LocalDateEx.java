package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx {
    public static void main(String[] args) {

        // 자바에서 날짜, 시간
        // java.util.Date
        // java.util.Calendar 둘다 예전 것들임
        // java.time.LocalDate; 날짜 정보
        // java.time.LocalTime; 시간 정보
        // java.time.LocalDateTime; 날짜 + 시간 정보

        LocalDate date = LocalDate.now(); // 객체생성 없이 활용 가능 2025-10-17
        LocalTime time = LocalTime.now(); // 14:58:40.035710700
        LocalDateTime now = LocalDateTime.now(); // 2025-10-17T14:58:40.035710700

        // 년-월-일T시:분:초
        // 시간 : 24시간제

        System.out.println(date);
        System.out.println(time);
        System.out.println(now);

        // 년, 월, 일 가져오기. getxxx()
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

        // 시, 분, 초
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);

        // 윤년, 평년
        System.out.println("윤년? " + date.isLeapYear());

        // 특정 날짜 지정
        LocalDate date2 = LocalDate.of(2024, 1, 1);

        // 날짜와 시간 조작 : 더하기, 빼기
        LocalDateTime target = now.plusYears(1)
                .minusMonths(2)
                .plusDays(3)
                .plusHours(4)
                .plusMinutes(5)
                .plusSeconds(6);
        System.out.println(target);

        // 날짜와 시간 비교
        LocalDateTime startDate = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
        LocalDateTime endDate = LocalDateTime.of(2024, 3, 31, 18, 0, 0);

        // isBefor 이전, isAfter 이후
        if (startDate.isBefore(endDate)) {
            System.out.println("과정 진행중입니다.");
        } else if (startDate.isEqual(endDate)) {
            System.out.println("오늘 마감입니다.");
        } else if (startDate.isAfter(endDate)) {
            System.out.println("종료했습니다.");
        }
    }
}
