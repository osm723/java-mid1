package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model3");
        Dog dog1 = new Dog("멍멍이", 3);
        Dog dog2 = new Dog("왈왈이", 2);

        System.out.println("toString");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("println");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        String hexString = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("hexString = " + hexString);

        String hexString2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("hexString2 = " + hexString2);
    }
}
