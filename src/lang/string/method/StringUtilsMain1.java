package lang.string.method;

public class StringUtilsMain1 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        System.out.println("String.valueOf(num) = " + String.valueOf(num));
        System.out.println("String.valueOf(bool) = " + String.valueOf(bool));
        System.out.println("String.valueOf(obj) = " + String.valueOf(obj));
        System.out.println("num + \"\" = " + num + "");

        char[] charArray = str.toCharArray();
        System.out.println(charArray);
        for (char c : charArray) {
            System.out.print(c);
        }
    }
}
