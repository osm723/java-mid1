package lang.object.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id100");
        UserV2 user2 = new UserV2("id100");

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
        System.out.println("user1==user2 = " + (user1==user2));
        System.out.println("user1.equals(user2) = " + (user1.equals(user2)));


    }
}
