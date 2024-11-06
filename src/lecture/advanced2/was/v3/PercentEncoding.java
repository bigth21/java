package lecture.advanced2.was.v3;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.UTF_8;

public class PercentEncoding {
    public static void main(String[] args) {
        String encoded = URLEncoder.encode("가", UTF_8);
        System.out.println("encoded = " + encoded);

        String decode = URLDecoder.decode(encoded, UTF_8);
        System.out.println("decode = " + decode);

        System.out.println(Arrays.toString("가".getBytes(UTF_8)));
    }
}
