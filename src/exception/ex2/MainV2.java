package exception.ex2;

import java.util.Scanner;

public class MainV2 {

    public static void main(String[] args) throws NetworkClientExceptionV2 {
        //NetworkService2_1 networkService = new NetworkService2_1();
//        NetworkService2_2 networkService = new NetworkService2_2();
//        NetworkService2_3 networkService = new NetworkService2_3();
//        NetworkService2_4 networkService = new NetworkService2_4();
        NetworkService2_5 networkService = new NetworkService2_5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if ("exit".equals(input)) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
