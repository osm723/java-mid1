package lang.string.bulider;

public class StringBuliderMain2 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4, "Java")
                .delete(4, 8)
                .reverse()
                .toString();

        System.out.println("string = " + string);
    }
}
