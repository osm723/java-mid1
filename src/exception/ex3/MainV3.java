package exception.ex3;

import java.util.Scanner;

public class MainV3 {

    public static void main(String[] args) {
        //NetworkService3_1 networkService = new NetworkService3_1();
        NetworkService3_2 networkService = new NetworkService3_2();

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
