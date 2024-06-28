package enumeration.ref1;


public class StringGradeRefMain1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService service = new DiscountService();
        int basic = service.discount(ClassGrade.BASIC, price);
        int gold = service.discount(ClassGrade.GOLD, price);
        int diamond = service.discount(ClassGrade.DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
