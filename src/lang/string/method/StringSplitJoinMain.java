package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println("s = " + s);
        }

        String joinStr = "";
        for (String s : splitStr) {
            joinStr += s + "-";
        }
        System.out.println("joinStr = " + joinStr);

        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("joinedStr = " + joinedStr);

        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
