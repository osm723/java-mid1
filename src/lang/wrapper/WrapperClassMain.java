package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10);
        Integer integerObj2 = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        int intValue = integerObj.intValue();
        System.out.println("value = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);
        double doubleValue = doubleObj.doubleValue();
        System.out.println("doubleValue = " + doubleValue);

        System.out.println("(newInteger == integerObj) = " + (newInteger == integerObj));
        System.out.println("(integerObj2 == integerObj) = " + (integerObj2 == integerObj));

    }
}
