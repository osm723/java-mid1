package enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        System.out.println("ClassGrade.BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("ClassGrade.GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("ClassGrade.DIAMOND = " + ClassGrade.DIAMOND.getClass());

        System.out.println("ClassGrade.BASIC = " + ClassGrade.BASIC);
        System.out.println("ClassGrade.GOLD = " + ClassGrade.GOLD);
        System.out.println("ClassGrade.DIAMOND = " + ClassGrade.DIAMOND);
    }
}
