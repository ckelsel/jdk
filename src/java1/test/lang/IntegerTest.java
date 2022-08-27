package java1.test.lang;

public class IntegerTest {
    public static void main(String[] args) {
        Integer value = new Integer(10);

        Integer ten = Integer.valueOf(1);
        ten = value;

        Integer one = Integer.valueOf("1");

        value = 11;
    }
}
