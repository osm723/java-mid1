package exception.ex2;

public class NetworkClientV2 {

    private final String addrees;
    public boolean connectError;
    private boolean sendError;

    public NetworkClientV2(String addrees) {
        this.addrees = addrees;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", addrees + " 서버 연결 실패");
        }

        System.out.println(addrees + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if (sendError) {
            throw new NetworkClientExceptionV2("sendError", addrees + " 서버에 데이터 전송 실패");
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
