package lombok2.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx2 {
    public static void main(String[] args) {
        File currDir = new File("c:\\temp");

        File[] files = currDir.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }

        if (currDir.exists()) {
            currDir.mkdir();
        }
        File dir = new File("c:\\temp\\dir");
        File file1 = new File("c:\\temp\\dir\\file1.txt");
        File file2 = new File("c:\\temp\\file1.txt");
        File file3 = new File("c:\\temp\\file2.txt");

        if (!dir.exists()) 
            dir.mkdir(); 
        try {
            if (!file1.exists())
                file1.createNewFile();
            if (!file2.exists())
                file2.createNewFile();
            if (!file3.exists())
                file3.createNewFile();
            } catch (IOException e) {
            
                e.printStackTrace();
            }// 컴파일 익셉션나면 try catch.
        
            files = currDir.listFiles();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
            System.out.println("\t 날짜    시간    형태       크기     이름");
            System.out.println("================================================");
            for (File file : files) {
                System.out.printf(sdf.format(new Date(file.lastModified())));
                if (file.isDirectory()) {
                    System.out.printf("\t<DIR>\t\t" + file.getName());
                } else {
                    System.out.printf("\t\t\t" + file.length() + "\t" + file.getName());
                }
                System.out.println();
            }
        // dir 이 없다면-> dir mkdir 즉, dir 만들어라 -> 파일들도 하나씩 만들어라
        // crriDir에 있는 디렉토리와 파일을 가져와라. 
        // sdf. format(new Date(file.lastModified)) 최종 변경 시간을 알려준다. long 값. 
        // 날짜 형식으로 바꾸기를 위해서 1. java.utle.Date 2. java.time 활용하기
        // 위에선 1번 new Date() 활용 2번이라면 LocalDate.ofEpochday를 사용하면 됨
        // 그리고 형식을 "yyyy-MM-dd a HH:mm" 으로 맞추라고 명령한 것이다. a는 am 을 의미
        
        
    }
}
