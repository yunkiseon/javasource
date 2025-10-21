package lombok2.io;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        // 경로 지저할 때 / 나 \ 사용한다.
        // \n, \t 등을 쓰기때문에 경로지정할 때 헷갈리지 않기 위해서 \\ 사용한다.
        // File file = new File("c:/temp/file1.txt"); 이것은 아래와 동일하다.
        // File file = new File("c:\\temp\\","file1.txt");
        File parent = new File("c:\\temp");
        File file = new File(parent, "file1.txt");
        String name = file.getName();
        System.out.println("파일명 " + name); // 파일명 file1.txt

        // 확장자를 제외한 이름 출력
        name.substring(0, 5);//이러한 경우 자릿수에 따라서 제외할 확장자의 위치가 바뀌기 때문에 불편하다
        int pos = name.lastIndexOf(".");
        System.out.println("확장자를 제외한 이름 " +name.substring(0, pos));//하면 알아서 .을 서치하기에 편하다.
        System.out.println("확장자 " + name.substring(pos + 1));
        System.out.println("경로를 포함한 파일명 " + file.getPath());
        System.out.println("파일이 속해 있는 디렉토리" + file.getParent());
        System.out.println("파일 pathSeparator " + File.pathSeparator);
        System.out.println("파일 pathSeparatorChar " + File.pathSeparatorChar);
        System.out.println("파일 separator " + File.separator);// / 이냐 \ 이냐를 묻는 것
        System.out.println("파일 separatorChar " + File.separatorChar);
        
    }
}
