package exception.ex1.checked;

public class Service {

    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {
            System.out.println("예외 처리 getMessage() = " + e.getMessage());
        }
        System.out.println("정상 처리");
    }

    public void catchThrow() throws MyCheckedException {
        client.call();;
    }
}
