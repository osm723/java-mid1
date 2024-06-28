package enumeration.ref1;



public class DiscountService {

    public int discount(ClassGrade ClassGrade, int price) {
        return price * ClassGrade.getDiscountPercent() / 100;
    }
}
