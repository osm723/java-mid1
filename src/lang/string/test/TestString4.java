package lang.string.test;

public class TestString4 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String substring = str.substring(0, 5);
        String substring1 = str.substring(5, 9);
        System.out.println("substring = " + substring);
        System.out.println("substring1 = " + substring1);
    }
}
