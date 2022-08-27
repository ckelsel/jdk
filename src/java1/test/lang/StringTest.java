package java1.test.lang;

import java.util.HashMap;

public class StringTest {
    public static void main(String[] args) {
        String str = new String();

        str.startsWith("a");

        String str2 = new String("aa");
        str.startsWith(str2);


        StringBuffer buffer = new StringBuffer();
        buffer.append("1");
        buffer.insert(1, "a");
        buffer.length();
    }
}
