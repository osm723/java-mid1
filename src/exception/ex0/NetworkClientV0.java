package exception.ex0;

public class NetworkClientV0 {

    private final String addrees;

    public NetworkClientV0(String addrees) {
        this.addrees = addrees;
    }

    public String connect() {
        System.out.println(addrees + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        System.out.println(addrees + " 서버에 데이터 전송 : " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(addrees + " 서버 연결 해제");
    }


}
