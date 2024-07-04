package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkService3_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress());
            System.out.println("[연결 오류] 메시지 : " + e.getMessage());
        } catch (SendExceptionV3 e2) {
            System.out.println("[전송 오류] 주소 : " + e2.getSendData());
            System.out.println("[전송 오류] 메시지 : " + e2.getMessage());
        } finally {
            client.disconnect();
        }

    }
}
