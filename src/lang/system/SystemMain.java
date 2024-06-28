package lang.system;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

public class SystemMain {

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        long nanoTime = System.nanoTime();
        System.out.println("nanoTime = " + nanoTime);

        Map<String, String> getenv = System.getenv();
        System.out.println("getenv = " + getenv);

        Properties properties = System.getProperties();
        System.out.println("properties = " + properties);
        System.out.println("properties.getProperty(\"java.version\") = " + properties.getProperty("java.version"));

        char[] originArr = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArr = new char[5];
        System.arraycopy(originArr, 0, copiedArr, 0 ,originArr.length);
        System.out.println("copiedArr = " + copiedArr);
        System.out.println("Arrays.toString(copiedArr) = " + Arrays.toString(copiedArr));

        System.exit(0);
        System.out.println(" = ");
    }
}
