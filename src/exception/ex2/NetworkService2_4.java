package exception.ex2;


public class NetworkService2_4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode());
            System.out.println("[오류] 메시지 : " + e.getMessage());
        }

        client.disconnect();

    }
}
