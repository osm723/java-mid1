package nested.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        //localPrinter.print();
        //localVar = 10;
        //paramVar = 20;
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV1 = new LocalOuterV4();
        Printer printer = localOuterV1.process(2);
        printer.print();

        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
    }
}
