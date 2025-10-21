package lombok2.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BufferedWriterEx1 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아서 파일에 출력하는 프로그램 작성
        // q 입력하면 받던 것을 중지
        // 입력받은 모든 string 을 메모장에 저장 

        Scanner sc = new Scanner(System.in);
        String input = " ";
        System.out.println("파일에 작성할 데이터를 입력해 주세요.");
        System.out.println("중지를 원하시면 q를 입력하세요.");
        String content = null;
        do {
            System.out.println(">> ");
            input = sc.nextLine();
            content += input;
        } while (!input.equals("q"));
        
        try {
            FileWriter fw = new FileWriter("c:\\temp\\user.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }

}
