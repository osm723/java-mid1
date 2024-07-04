package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {

    private final String addrees;
    public boolean connectError;
    private boolean sendError;

    public NetworkClientV3(String addrees) {
        this.addrees = addrees;
    }

    public void connect() throws ConnectExceptionV3 {
        if (connectError) {
            throw new ConnectExceptionV3(addrees, addrees + " 서버 연결 실패");
        }

        System.out.println(addrees + " 서버 연결 성공");
    }

    public void send(String data) throws SendExceptionV3 {
        if (sendError) {
            throw new SendExceptionV3(data, addrees + " 서버에 데이터 전송 실패 : " + data);
            //throw new RuntimeException();
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
