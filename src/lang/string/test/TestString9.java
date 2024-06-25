package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@naver.com";
        String[] split = email.split("@");
        String s1 = split[0];
        String s2 = split[1];
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
