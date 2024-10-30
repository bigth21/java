package lecture.advanced2.charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.SortedMap;

public class AvailableCharsetMain {
    public static void main(String[] args) {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        for (String charset : charsets.keySet()) {
            System.out.println("charset = " + charset);
        }

        System.out.println("============");
        // MS949, ms949, x-windows-949
        Charset charset1 = Charset.forName("MS949");
        System.out.println("charset = " + charset1);

        for (String alias : charset1.aliases()) {
            System.out.println("alias = " + alias);
        }

//        Charset charset2 = Charset.forName("UTF-8");
        Charset charset2 = StandardCharsets.UTF_8;
        System.out.println("charset2 = " + charset2);

        // System default
        Charset charset3 = Charset.defaultCharset();
        System.out.println("charset3 = " + charset3);
    }
}
