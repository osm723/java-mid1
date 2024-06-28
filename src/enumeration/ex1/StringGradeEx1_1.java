package enumeration.ex1;

public class StringGradeEx1_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService service = new DiscountService();
        int basic = service.discount(StringGrade.BASIC, price);
        int gold = service.discount(StringGrade.GOLD, price);
        int diamond = service.discount(StringGrade.DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
