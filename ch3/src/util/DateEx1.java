package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);// Thu Oct 16 15:51:06 KST 2025 시스템 날짜, 시간을 가져옴 예전에 많이 씀
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM 월 dd일 hh시 mm분 ss초");
        System.out.println(sdf.format(date));
    }
}
