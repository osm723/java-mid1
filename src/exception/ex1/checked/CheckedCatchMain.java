package exception.ex1.checked;

public class CheckedCatchMain {

    public static void main(String[] args) {
        Service service = new Service();

        service.callCatch();
        System.out.println("시스템 정상 종료");
    }
}
