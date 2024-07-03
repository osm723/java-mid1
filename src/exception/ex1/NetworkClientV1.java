package exception.ex1;

public class NetworkClientV1 {

    private final String addrees;
    public boolean connectError;
    private boolean sendError;

    public NetworkClientV1(String addrees) {
        this.addrees = addrees;
    }

    public String connect() {
        if (connectError) {
            System.out.println(addrees + " 서버 연결 실패");
            return "connectError";
        }

        System.out.println(addrees + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        if (sendError) {
            System.out.println(addrees + " 서버에 데이터 전송 실패");
            return "sendError";
        }

        System.out.println(addrees + " 서버에 데이터 전송 : " + data);
        return "success";
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
