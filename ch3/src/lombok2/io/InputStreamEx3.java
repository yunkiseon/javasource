package lombok2.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx3 {
    public static void main(String[] args) {

        try (InputStream in = new FileInputStream("c:\\temp\\img1.jpg");
                OutputStream out = new FileOutputStream("c:\\temp\\copy1.jpg");) {

            int input = 0;

            while ((input = in.read()) != -1) {
                out.write(input);
            }
            ;
        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
