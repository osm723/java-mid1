package lang.string.bulider;

public class StringBuliderMain1 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("sb = " + sb);
        sb.delete(4, 8);
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
