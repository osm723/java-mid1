package lang.string.method;

public class StringInfoMain {

    public static void main(String[] args) {
        String str = "Hello, Java!";
        System.out.println("str.length() = " + str.length());
        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println("str.isBlank() = " + str.isBlank());
        System.out.println("공백 " + "      ".isBlank());
        System.out.println("str.charAt(7) = " + str.charAt(7));
    }
}
