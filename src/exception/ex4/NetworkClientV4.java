package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {

    private final String addrees;
    public boolean connectError;
    private boolean sendError;

    public NetworkClientV4(String addrees) {
        this.addrees = addrees;
    }

    public void connect() {
        if (connectError) {
            throw new ConnectExceptionV4(addrees, addrees + " 서버 연결 실패");
        }

        System.out.println(addrees + " 서버 연결 성공");
    }

    public void send(String data) {
        if (sendError) {
            throw new SendExceptionV4(data, addrees + " 서버에 데이터 전송 실패 : " + data);
        }

        System.out.println(addrees + " 서버에 데이터 전송 : " + data);
    }

    public void disconnect() {
        System.out.println(addrees + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }

        if (data.contains("error2")) {
            sendError = true;
        }
    }


}
