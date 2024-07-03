package exception.ex1.unchecked;

public class Service {
    Client client = new Client();


    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리 getMessage " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    public void callThrow() {
        client.call();
    }
}
