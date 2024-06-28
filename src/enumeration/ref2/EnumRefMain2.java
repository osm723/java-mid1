package enumeration.ref2;

import static enumeration.ref2.Grade.*;

public class EnumRefMain2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService service = new DiscountService();
        int basic = service.discount(BASIC, price);
        int gold = service.discount(GOLD, price);
        int diamond = service.discount(DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
