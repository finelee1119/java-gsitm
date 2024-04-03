package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReduceTest {
    public static void main(String[] args) {
        String[] message = {"안녕하세요", "hello", "반갑습니다 좋은 아침입니다", "Good Morning"};

        String result;
        result = Arrays.stream(message).reduce("", (s1, s2) -> {
            if (s1.length() >= s2.length()) {
                return s1;
            } else {
                return s2;
            }
        });
        System.out.println(result);

    }
}
