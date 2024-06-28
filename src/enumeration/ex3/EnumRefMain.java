package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("Grade.BASIC = " + BASIC.getClass());
        System.out.println("Grade.GOLD = " + GOLD.getClass());
        System.out.println("Grade.DIAMOND = " + DIAMOND.getClass());

        System.out.println("Grade.BASIC = " + BASIC);
        System.out.println("Grade.GOLD = " + GOLD);
        System.out.println("Grade.DIAMOND = " + DIAMOND);

        System.out.println("ref.BASIC = " + refValue(BASIC));
        System.out.println("ref.GOLD = " + refValue(GOLD));
        System.out.println("ref.DIAMOND = " + refValue(DIAMOND));
    }

    private static String refValue(Grade grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
