package lombok2.io;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx1 {
    public static void main(String[] args) {
        
        try {
            Reader in = new FileReader("c:\\temp\\file1.txt");
            Writer out = new FileWriter("c:\\temp\\output2.txt");
            
            int input = 0;
            char[] cbuf = new char[1024];
            while ((input = in.read(cbuf)) != -1) {
                out.write(new String(cbuf));
            }

            in.close();
            out.close();
        } catch (IOException e) {//FileNotFoundException의 부모가 IOException여서 후자만 적어도 처리 가능
            
            e.printStackTrace();

        }
    }
}
