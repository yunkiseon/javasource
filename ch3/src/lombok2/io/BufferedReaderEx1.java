package lombok2.io;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        
        try {
            // InputStream in = new FileInputStream("c:\\temp\\file1.txt");
            // InputStreamReader reader = new InputStreamReader(in, "utf8");

            // BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\temp\\file1.txt"));
            // BufferedOutputStream bos = new BufferedOutputStream(reader);
            // BufferedReader br = new BufferedReader(reader);

            // Writer out = new FileWriter("c:\\temp\\output4.txt");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\temp\\file1.txt"), "utf8"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\output4.txt"));
            
            String input = null;
            while ((input = br.readLine()) != null) {
                bw.write(input);
                bw.newLine();// 엔터
            }

            // in.close(); 
            // bos.flush();
            // out.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            
            e.printStackTrace();

        }
    }
}
