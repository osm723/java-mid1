package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService service = new DiscountService();
        int vip = service.discount("VIP", price);

        System.out.println("vip = " + vip);

        int diamondd = service.discount("DIAMONDD", price);

        System.out.println("diamondd = " + diamondd);

        int gold = service.discount("gold", price);

        System.out.println("gold = " + gold);
    }
}
