package lang.wrapper.test;

public class WrapperTest3 {

    public static void main(String[] args) {
        String str = "100";

        Integer integerVal = Integer.valueOf(str);
        System.out.println("integerVal = " + integerVal);

        int intVal = integerVal.intValue();
        System.out.println("intVal = " + intVal);

        Integer integerVal2 = Integer.valueOf(intVal);
        System.out.println("integerVal2 = " + integerVal2);
    }
}
