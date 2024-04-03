package java.stream.streamTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamTestMain {
    public static void main(String[] args) {
//        InputStream in = System.in;
//        InputStreamReader ir = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(ir);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
//            char[] data = new char[10];
//            ir.read(data);
            String data = br.readLine();
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
