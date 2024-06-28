package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = String.class;
        Class clazz1 = new String().getClass();
        Class<?> clazz2 = Class.forName("java.lang.String");

        Field[] declaredField = clazz.getDeclaredFields();
        for (Field field : declaredField) {
            System.out.println("field = " + field);
        }

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        System.out.println("clazz = " + clazz.getSuperclass().getName());

        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("anInterface = " + anInterface);
        }
    }
}
