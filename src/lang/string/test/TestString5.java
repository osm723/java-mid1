package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        int indexOf = str.indexOf(ext);
        String fileName = str.substring(0, indexOf);
        String extName = str.substring(indexOf);
        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
