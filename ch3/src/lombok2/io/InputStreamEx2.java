package lombok2.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx2 {
    public static void main(String[] args) {
        // 스트림 : 통로
        try {
            // InputStream in = new FileInputStream(""); 아래와 동일하게 가능 
            InputStream in = new FileInputStream("c:\\temp\\img1.jpg");
            OutputStream out = new FileOutputStream("c:\\temp\\copy2.jpg");
            
            int input = 0;
            byte[] bytes = new byte[1024];
            while ((input = in.read(bytes))!= -1) {
                
                out.write(bytes);
            }

            in.close();
            out.close();
        } catch (IOException e) {//FileNotFoundException의 부모가 IOException여서 후자만 적어도 처리 가능
            
            e.printStackTrace();

        }
    }
}
