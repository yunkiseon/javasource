package lombok2.io;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx2 {
    public static void main(String[] args) {
        
        try {
            InputStream in = new FileInputStream("c:\\temp\\file1.txt");
            InputStreamReader reader = new InputStreamReader(in, "utf8");
            Writer out = new FileWriter("c:\\temp\\output3.txt");
            
            int input = 0;
            char[] cbuf = new char[1024];
            while ((input = reader.read(cbuf)) != -1) {
                out.write(new String(cbuf));
            }

            in.close();
            out.close();
        } catch (IOException e) {
            
            e.printStackTrace();

        }
    }
}
