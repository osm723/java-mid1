package lang.wrapper.test;

public class WrapperTest2 {

    public static void main(String[] args) {
        String[] arr = {"1.5", "2.5", "3.0"};

        double sum = 0;
        for (String s : arr) {
            double v = Double.parseDouble(s);
            sum += v;
        }
        System.out.println("sum = " + sum);
    }
}
