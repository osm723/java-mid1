package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int indexOf = str.indexOf(key);
        System.out.println("indexOf = " + indexOf);
        while (indexOf >= 0) {
            indexOf = str.indexOf(key, indexOf + 1);
            count++;
        }

        System.out.println("count = " + count);
    }
}
