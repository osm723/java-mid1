package exception.ex4;


import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {

    public static void main(String[] args) {
        NetworkService4 networkService = new NetworkService4();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if ("exit".equals(input)) {
                break;
            }
            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }

            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    // 공통 예외처리
    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메시지 : 죄송합니다. 알 수 없는 문제가 발생 했습니다.");
        System.out.println("개발자 메시지 : ");
        e.printStackTrace(System.out);

        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 데이터 : " + sendEx.getSendData());
        }
    }
}
