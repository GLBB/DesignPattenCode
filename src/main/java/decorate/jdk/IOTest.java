package decorate.jdk;

import java.io.*;

public class IOTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
        while ((c=inputStream.read())!=-1){
            System.out.print((char)c);
        }
    }
}
